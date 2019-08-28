package com.doublek.assistent.exception;

import com.doublek.assistent.constant.ErrorCodeConstant;
import lombok.Data;
import lombok.Getter;

/**
 * User: Ousion
 * Date: 2019/8/28
 */
@Getter
public class BaseException extends RuntimeException {

    private String code;
    private String desc;


    public BaseException(ErrorCodeConstant errorCodeConstant) {
        this.code = errorCodeConstant.getCode();
        this.desc = errorCodeConstant.getDesc();
    }
}
