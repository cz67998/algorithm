package com.example.algorithm.reflection;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/5/15
 * Time:13:56
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println(Test.a);
    }
    static {
        System.out.print("DN");
    }
    public static final String a = "CS";
}

