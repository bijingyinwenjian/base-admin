package com.sky.modules.sys.service;



import com.sky.modules.sys.model.SysAdmin;
import com.sky.modules.sys.model.SysResource;

import java.util.List;

/**
 * 后台用户缓存管理Service
 * Created by yiwenjian on 2020/3/13.
 */
public interface SysAdminCacheService {
    /**
     * 删除后台用户缓存
     */
    void delAdmin(Long adminId);

    /**
     * 删除后台用户资源列表缓存
     */
    void delResourceList(Long adminId);

    /**
     * 当角色相关资源信息改变时删除相关后台用户缓存
     */
    void delResourceListByRole(Long roleId);

    /**
     * 当角色相关资源信息改变时删除相关后台用户缓存
     */
    void delResourceListByRoleIds(List<Long> roleIds);

    /**
     * 当资源信息改变时，删除资源项目后台用户缓存
     */
    void delResourceListByResource(Long resourceId);

    /**
     * 获取缓存后台用户信息
     */
    SysAdmin getAdmin(String username);

    /**
     * 设置缓存后台用户信息
     */
    void setAdmin(SysAdmin admin);

    /**
     * 获取缓存后台用户资源列表
     */
    List<SysResource> getResourceList(Long adminId);

    /**
     * 设置后台后台用户资源列表
     */
    void setResourceList(Long adminId, List<SysResource> resourceList);
}
