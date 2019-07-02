package com.example.algorithm.interval;

import lombok.Data;
import lombok.Getter;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/3
 * Time:14:24
 **/
@Data
public class Interval {

    private Integer left;

    private Integer right;

    public Interval(Integer left, Integer right) {
        if (left <= right) {
            this.left = left;
            this.right = right;
        }

    }

    public Interval(Integer left) {

        this(left,10);


    }

    public static void main(String[] args) {
        Interval interval1 = new Interval(1, 2);
        Interval interval2 = new Interval(1);
        interval2.setRight(2);
        System.out.println(interval2.toString());
        System.out.println(interval1.hashCode());
        System.out.println(interval2.hashCode());
        System.out.println(interval1.equals(interval2));
        new TestInterface() {
            @Override
            public void test() {
                System.out.println(1);
            }

        }.test();
    }
}
