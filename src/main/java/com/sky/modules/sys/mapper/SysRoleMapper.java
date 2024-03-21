package com.sky.modules.sys.mapper;

import com.sky.modules.sys.model.SysRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 后台用户角色表 Mapper 接口
 * </p>
 *
 * @author yinwenjian
 * @since 2024-03-21
 */
public interface SysRoleMapper extends BaseMapper<SysRole> {

    /**
     * 获取用户所有角色
     */
    List<SysRole> getRoleList(@Param("adminId") Long adminId);

}
