package com.sky.modules.sys.mapper;

import com.sky.modules.sys.model.SysResource;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 后台资源表 Mapper 接口
 * </p>
 *
 * @author yinwenjian
 * @since 2024-03-21
 */
public interface SysResourceMapper extends BaseMapper<SysResource> {

    /**
     * 获取用户所有可访问资源
     */
    List<SysResource> getResourceList(@Param("adminId") Long adminId);

    /**
     * 根据角色ID获取资源
     */
    List<SysResource> getResourceListByRoleId(@Param("roleId") Long roleId);

}
