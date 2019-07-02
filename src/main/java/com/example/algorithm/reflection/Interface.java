package com.example.algorithm.reflection;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/5/15
 * Time:14:47
 **/
public interface Interface {
    void doSomething();

    void somethingElse(String arg);
}

class RealObject implements Interface {
    public void doSomething() {
        System.out.println("doSomething.");
    }

    public void somethingElse(String arg) {
        System.out.println("somethingElse " + arg);
    }
}
