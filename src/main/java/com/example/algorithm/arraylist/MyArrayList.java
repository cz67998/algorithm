package com.example.algorithm.arraylist;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/4
 * Time:10:02
 **/
public class MyArrayList {
private transient Object[] data=null;
private  int size=0;
private static final int DEFAULT_CAPACITY=0;
public MyArrayList(int initialCapacity){
    if(initialCapacity<0){
        throw new IllegalArgumentException("非法的初始容量值：" + initialCapacity);
    }else {
        this.data=new Object[initialCapacity];
    }
}
}
