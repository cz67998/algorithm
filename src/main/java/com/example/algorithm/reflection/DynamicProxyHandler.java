package com.example.algorithm.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/5/15
 * Time:14:48
 **/
public class DynamicProxyHandler implements InvocationHandler {
    private Object proxyed;

    public DynamicProxyHandler(Object proxyed) {
        this.proxyed = proxyed;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        System.out.println("代理工作了.");
        return method.invoke(proxyed, args);
    }
}
