package com.example.algorithm.common;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/17
 * Time:15:43
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println(Test2.a);
    }

    static {
        System.out.print("A");
    }

   // public static final String a = "B";
}

class Test2 extends Test {
    public static final String a = "D";
    static {
        System.out.print("C");
    }

}