package com.doublek.assistent.model;

import lombok.Builder;
import lombok.Data;

/**
 * User: Ousion
 * Date: 2019/8/28
 */
@Data
@Builder
public class  Response<T> {

    private String code;
    private String desc;
    private T data;

}
