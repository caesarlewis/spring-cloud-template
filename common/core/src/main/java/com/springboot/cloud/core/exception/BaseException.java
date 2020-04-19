package com.springboot.cloud.core.exception;

import lombok.Getter;

/**
 * @author LiuShiZeng
 * @since 2020/4/19
 */
@Getter
public class BaseException extends RuntimeException {

    private final ErrorType errorType;

    public BaseException(){
        this.errorType = SystemErrorEnum.SYSTEM_ERROR;
    }

    public BaseException(ErrorType errorType) {
        this.errorType = errorType;
    }

    public BaseException(ErrorType errorType, String message) {
        super(message);
        this.errorType = errorType;
    }

    public BaseException(ErrorType errorType, String message, Throwable cause) {
        super(message, cause);
        this.errorType = errorType;
    }

}
