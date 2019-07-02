package com.example.algorithm.common;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/17
 * Time:16:11
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println("A");
        new Main();
        new Main();
    }
    public Main() {

        System.out.println("B");

    }
    {

        System.out.println("C");

    }
    static {

        System.out.println("D");

    }
}
