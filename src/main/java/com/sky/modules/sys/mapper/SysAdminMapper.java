package com.sky.modules.sys.mapper;

import com.sky.modules.sys.model.SysAdmin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 后台用户表 Mapper 接口
 * </p>
 *
 * @author yinwenjian
 * @since 2024-03-21
 */
public interface SysAdminMapper extends BaseMapper<SysAdmin> {

    /**
     * 获取资源相关用户ID列表
     */
    List<Long> getAdminIdList(@Param("resourceId") Long resourceId);

}
