package com.example.algorithm.reflection;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/5/15
 * Time:14:27
 **/
public class Derived extends Base{
}
class Main1 {
    public static void main(String[] args) {
        Base base = new Derived();
        if (base instanceof Derived) {
            // 这里可以向下转换了
            System.out.println("ok");
        }
        else {
            System.out.println("not ok");
        }
    }
}