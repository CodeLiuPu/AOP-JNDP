package com.update;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * author : liupu
 * date   : 2019/5/7
 * desc   :
 */
public class LoggerHandler implements InvocationHandler {
    private Object target;

    public LoggerHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("start");
        Object result = method.invoke(target, args);
        System.out.println("end");
        return result;
    }
}
