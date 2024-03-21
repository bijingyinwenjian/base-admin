package com.sky.modules.sys.controller;

import com.sky.common.api.CommonResult;
import com.sky.modules.sys.model.SysResourceCategory;
import com.sky.modules.sys.service.SysResourceCategoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 后台资源分类管理Controller
 * Created by yiwenjian on 2020/2/5.
 */
@Controller
@Tag(name = "SysResourceCategoryController",description = "后台资源分类管理")
@RequestMapping("/resourceCategory")
public class SysResourceCategoryController {
    @Autowired
    private SysResourceCategoryService resourceCategoryService;

    @Operation(summary = "查询所有后台资源分类")
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<SysResourceCategory>> listAll() {
        List<SysResourceCategory> resourceList = resourceCategoryService.listAll();
        return CommonResult.success(resourceList);
    }

    @Operation(summary = "添加后台资源分类")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody SysResourceCategory sysResourceCategory) {
        boolean success = resourceCategoryService.create(sysResourceCategory);
        if (success) {
            return CommonResult.success(null);
        } else {
            return CommonResult.failed();
        }
    }

    @Operation(summary = "修改后台资源分类")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@PathVariable Long id,
                               @RequestBody SysResourceCategory sysResourceCategory) {
        sysResourceCategory.setId(id);
        boolean success = resourceCategoryService.updateById(sysResourceCategory);
        if (success) {
            return CommonResult.success(null);
        } else {
            return CommonResult.failed();
        }
    }

    @Operation(summary = "根据ID删除后台资源")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(@PathVariable Long id) {
        boolean success = resourceCategoryService.removeById(id);
        if (success) {
            return CommonResult.success(null);
        } else {
            return CommonResult.failed();
        }
    }
}
