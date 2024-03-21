package com.sky.modules.sys.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sky.common.api.CommonPage;
import com.sky.common.api.CommonResult;
import com.sky.modules.sys.dto.SysMenuNode;
import com.sky.modules.sys.model.SysMenu;
import com.sky.modules.sys.service.SysMenuService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 后台菜单管理Controller
 * Created by yiwenjian on 2020/2/4.
 */
@Controller
@Tag(name = "SysMenuController",description = "后台菜单管理")
@RequestMapping("/menu")
public class SysMenuController {

    @Autowired
    private SysMenuService menuService;

    @Operation(summary = "添加后台菜单")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody SysMenu sysMenu) {
        boolean success = menuService.create(sysMenu);
        if (success) {
            return CommonResult.success(null);
        } else {
            return CommonResult.failed();
        }
    }

    @Operation(summary = "修改后台菜单")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@PathVariable Long id,
                               @RequestBody SysMenu sysMenu) {
        boolean success = menuService.update(id, sysMenu);
        if (success) {
            return CommonResult.success(null);
        } else {
            return CommonResult.failed();
        }
    }

    @Operation(summary = "根据ID获取菜单详情")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<SysMenu> getItem(@PathVariable Long id) {
        SysMenu sysMenu = menuService.getById(id);
        return CommonResult.success(sysMenu);
    }

    @Operation(summary = "根据ID删除后台菜单")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(@PathVariable Long id) {
        boolean success = menuService.removeById(id);
        if (success) {
            return CommonResult.success(null);
        } else {
            return CommonResult.failed();
        }
    }

    @Operation(summary = "分页查询后台菜单")
    @RequestMapping(value = "/list/{parentId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<SysMenu>> list(@PathVariable Long parentId,
                                                  @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                  @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        Page<SysMenu> menuList = menuService.list(parentId, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(menuList));
    }

    @Operation(summary = "树形结构返回所有菜单列表")
    @RequestMapping(value = "/treeList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<SysMenuNode>> treeList() {
        List<SysMenuNode> list = menuService.treeList();
        return CommonResult.success(list);
    }

    @Operation(summary = "修改菜单显示状态")
    @RequestMapping(value = "/updateHidden/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateHidden(@PathVariable Long id, @RequestParam("hidden") Integer hidden) {
        boolean success = menuService.updateHidden(id, hidden);
        if (success) {
            return CommonResult.success(null);
        } else {
            return CommonResult.failed();
        }
    }
}
