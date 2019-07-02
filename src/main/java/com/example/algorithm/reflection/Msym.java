package com.example.algorithm.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/5/15
 * Time:13:30
 **/
public class Msym {
    public static  void test(String[] arg){
        for (String string : arg) {
            System.out.println(string);
        }
    }
    public static  void test1(String[] arg){
        for (String string : arg) {
            System.out.println(string);
        }
    }
    public static void main(String[] args)throws Exception {
        //获取字节码对象
        Class<Msym> clazz = (Class<Msym>) Class.forName("com.example.algorithm.reflection.Msym");
        //获取一个对象
        Constructor con =  clazz.getConstructor();
        Msym m = (Msym) con.newInstance();
        String[] s = new String[]{"aa","bb"};
        //获取Method对象
        Method method = clazz.getMethod("test1", String[].class);
        //调用invoke方法来调用
        method.invoke(m, (Object) s);
    }

}
