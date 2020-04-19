package com.springboot.cloud.core.exception;

/**
 * @author LiuShiZeng
 * @since 2020/4/19
 */
public interface ErrorType {

    /**
     * 获取异常code
     * @return
     */
    String getCode();

    /**
     * 获取异常信息
     * @return
     */
    String getMsg();

}
