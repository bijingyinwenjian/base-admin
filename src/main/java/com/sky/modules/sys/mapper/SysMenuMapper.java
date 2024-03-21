package com.sky.modules.sys.mapper;

import com.sky.modules.sys.model.SysMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 后台菜单表 Mapper 接口
 * </p>
 *
 * @author yinwenjian
 * @since 2024-03-21
 */
public interface SysMenuMapper extends BaseMapper<SysMenu> {

    /**
     * 根据后台用户ID获取菜单
     */
    List<SysMenu> getMenuList(@Param("adminId") Long adminId);
    /**
     * 根据角色ID获取菜单
     */
    List<SysMenu> getMenuListByRoleId(@Param("roleId") Long roleId);

}
