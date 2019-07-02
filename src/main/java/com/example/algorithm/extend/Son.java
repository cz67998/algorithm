package com.example.algorithm.extend;

import java.util.List;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/4
 * Time:14:07
 **/
public class Son extends Father{

     private String name;



    public static void main(String[] args){
        Son son=  new Son();
        son.name="1";
        System.out.println(son.name);
    }
}
