package com.doublek.assistent.constant;

import lombok.Getter;

/**
 * 响应码
 * User: Ousion
 * Date: 2019/8/28
 */
@Getter
public enum ResponseCodeEnum implements ErrorCodeConstant{

    /**成功*/
    SUCCESS("20000", "成功"),
    FAIL("999999", "失败"),


    ;

    private String code;
    private String desc;

    private ResponseCodeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
