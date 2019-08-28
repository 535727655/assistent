package com.doublek.assistent.advice;

import com.doublek.assistent.constant.ErrorCodeConstant;
import com.doublek.assistent.constant.ResponseCodeEnum;
import com.doublek.assistent.exception.BaseException;
import com.doublek.assistent.model.Request;
import com.doublek.assistent.model.RequestThreadLocal;
import com.doublek.assistent.model.Response;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * User: Ousion
 * Date: 2019/8/28
 */
@Aspect
@Slf4j
@Component
public class ResponseAdvice {



    @Around(value = "execution(* com.doublek.assistent.adapter.impl.*AdapterImpl.*(..))")
    public Response<Object> responseBefore(ProceedingJoinPoint pjd) {
        Request<Object> request = null;
        Object[] args = pjd.getArgs();
        Object[] result = args;

        for(int i = 0; i < args.length; ++i) {
            Object arg = result[i];
            if (arg instanceof Request) {
                request = (Request)arg;
                if (RequestThreadLocal.getRequest() == null) {
                    RequestThreadLocal.setRequest(request);
                }
            }
        }
        result = null;
        String methodName = pjd.getSignature().getName();
        String className = pjd.getTarget().getClass().getName();

        Object resultData;
        try {
            log.info("The method:{}.{}  args: {} ", new Object[]{className, methodName, request});
            resultData = pjd.proceed();
        } catch (Throwable var15) {
            BaseException baseException = null;
            if (var15 instanceof BaseException) {
                baseException = (BaseException)var15;
            } else {
                baseException = new BaseException(ResponseCodeEnum.FAIL);
            }

            log.error(var15.getMessage(), var15);
            Response<Object> errorResponse = Response.builder().code(baseException.getCode()).desc(baseException.getDesc()).build();
            log.info("The method:{}.{}  args: {} ", new Object[]{className, methodName, errorResponse});
            return errorResponse;
        } finally {
        }

        Response<Object> response = (Response)resultData;
        this.resetResponse(request, response);
        log.info("The method:{}.{}  args: {} ", new Object[]{className, methodName, response});
        return response;
    }

    protected void resetResponse(Request<Object> request, Response<Object> response) {

        String responseCode = response.getCode();
        if (null == responseCode || responseCode.isEmpty()) {
            response.setCode(ResponseCodeEnum.SUCCESS.getCode());
            response.setDesc(ResponseCodeEnum.SUCCESS.getDesc());
        }

    }
}
