package com.sky.modules.sys.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.sky.modules.sys.model.SysResourceCategory;

import java.util.List;

/**
 * 后台资源分类管理Service
 * Created by yiwenjian on 2020/2/5.
 */
public interface SysResourceCategoryService extends IService<SysResourceCategory> {

    /**
     * 获取所有资源分类
     */
    List<SysResourceCategory> listAll();

    /**
     * 创建资源分类
     */
    boolean create(SysResourceCategory sysResourceCategory);
}
