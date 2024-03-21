package com.sky.modules.sys.dto;

import com.sky.modules.sys.model.SysMenu;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 后台菜单节点封装
 * Created by yiwenjian on 2020/2/4.
 */
@Getter
@Setter
public class SysMenuNode extends SysMenu {
    @Schema(title = "子级菜单")
    private List<SysMenuNode> children;
}
