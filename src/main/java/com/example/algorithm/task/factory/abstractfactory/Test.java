package com.example.algorithm.task.factory.abstractfactory;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/9
 * Time:14:35
 **/
public class Test {
    public static void main(String[] args){
        Factory factory=new Factory();
        factory.createProduct1().show();
        factory.createProduct2().show();
    }
}
