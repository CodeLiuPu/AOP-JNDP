package com.update;

import java.lang.reflect.Proxy;

/**
 * author : liupu
 * date   : 2019/5/7
 * desc   :
 */
public class Demo {
    public static void main(String[] args) {
        IHelloWorld hw = new HelloWorld();
        LoggerHandler handler = new LoggerHandler(hw);
        IHelloWorld proxy = (IHelloWorld) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), hw.getClass().getInterfaces(), handler);
        proxy.sayHello();
    }
}
