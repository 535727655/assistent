package com.doublek.assistent.model;


/**
 * User: Ousion
 * Date: 2019/8/28
 */
public class RequestThreadLocal {

    protected static ThreadLocal<Request<Object>> threadLocal = new ThreadLocal();

    public RequestThreadLocal() {
    }

    public static Request<Object> getRequest() {
        return (Request)threadLocal.get();
    }

    public static void setRequest(Request<Object> request) {
        threadLocal.set(request);
    }

    public static void removeRequest() {
        threadLocal.remove();
    }

}
