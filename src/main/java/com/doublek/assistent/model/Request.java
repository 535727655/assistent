package com.doublek.assistent.model;

import lombok.Builder;
import lombok.Data;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * User: Ousion
 * Date: 2019/8/28
 */
@Data
@Builder
public class Request<T> {

    private T data;

}
