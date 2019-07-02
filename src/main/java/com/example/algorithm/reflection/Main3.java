package com.example.algorithm.reflection;

import java.lang.reflect.Proxy;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/5/15
 * Time:14:49
 **/
public class Main3 {
    public static void main(String[] args) {
        RealObject real = new RealObject();
        Interface proxy = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(), new Class[] {Interface.class},
                new DynamicProxyHandler(real));

        proxy.doSomething();
        proxy.somethingElse("luoxn28");
    }
}
