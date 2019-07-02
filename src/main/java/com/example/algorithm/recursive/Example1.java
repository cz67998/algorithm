package com.example.algorithm.recursive;

/**
 * 递归计算1+2+3+。。。+n
 * Created by IDEA
 * author:wangzhou
 * Date:2019/3/17
 * Time:13:33
 **/
public class Example1 {
    public   int accumulate(int n){
        if(n==1){return 1;}
        return accumulate(n-1)+n;
    }
    public static void main(String[] args){
        Example1 example1=new Example1();
        System.out.println(example1.accumulate(6));
    }
}
