package com.example.algorithm.reflection;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/5/15
 * Time:13:55
 **/
public class TestMain {
    public static void main(String[] args) {
        System.out.println(XYZ.name);
    }
}
class XYZ {
    public static String name = "luoxn28";

    static {
        System.out.println("xyz静态块");
    }

    public XYZ() {
        System.out.println("xyz构造了");
    }
}
