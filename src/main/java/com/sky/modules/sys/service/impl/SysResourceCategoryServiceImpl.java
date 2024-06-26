package com.sky.modules.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sky.modules.sys.mapper.SysResourceCategoryMapper;
import com.sky.modules.sys.model.SysResourceCategory;
import com.sky.modules.sys.service.SysResourceCategoryService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 后台资源分类管理Service实现类
 * Created by yiwenjian on 2020/2/5.
 */
@Service
public class SysResourceCategoryServiceImpl extends ServiceImpl<SysResourceCategoryMapper,SysResourceCategory> implements SysResourceCategoryService {

    @Override
    public List<SysResourceCategory> listAll() {
        QueryWrapper<SysResourceCategory> wrapper = new QueryWrapper<>();
        wrapper.lambda().orderByDesc(SysResourceCategory::getSort);
        return list(wrapper);
    }

    @Override
    public boolean create(SysResourceCategory sysResourceCategory) {
        sysResourceCategory.setCreateTime(new Date());
        return save(sysResourceCategory);
    }
}
