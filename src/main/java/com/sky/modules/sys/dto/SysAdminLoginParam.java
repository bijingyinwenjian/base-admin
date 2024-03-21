package com.sky.modules.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import jakarta.validation.constraints.NotEmpty;

/**
 * 用户登录参数
 * Created by yiwenjian on 2018/4/26.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SysAdminLoginParam {
    @NotEmpty
    @Schema(title = "用户名",required = true)
    private String username;
    @NotEmpty
    @Schema(title = "密码",required = true)
    private String password;
}
