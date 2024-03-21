package com.sky.common.api;

/**
 * 封装API的错误码
 * Created by yiwenjian on 2024/3/19.
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
