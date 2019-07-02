package com.example.algorithm.reflection;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/5/15
 * Time:14:10
 **/
public class Base {
    static int num = 1;

    static {
        System.out.println("Base " + num);
    }

}
class Main {
    public static void main(String[] args) throws  Exception{
        // 不会初始化静态块
        Class clazz1 = Base.class;
        System.out.println("------");
        // 会初始化
        Class clazz2 = Class.forName("com.example.algorithm.reflection.Base");
    }
}