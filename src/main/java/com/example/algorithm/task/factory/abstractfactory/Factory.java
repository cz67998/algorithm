package com.example.algorithm.task.factory.abstractfactory;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/9
 * Time:14:34
 **/
public class Factory implements ProductFactory {
    @Override
    public MyProduct1 createProduct1() {
        return new MyProduct1();
    }

    @Override
    public MyProduct2 createProduct2() {
        return new MyProduct2();
    }
}
