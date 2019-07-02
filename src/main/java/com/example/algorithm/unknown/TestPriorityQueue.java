package com.example.algorithm.unknown;

import com.example.algorithm.interval.Interval;

import java.util.PriorityQueue;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/9
 * Time:17:42
 **/
public class TestPriorityQueue {
    public static void main(String[] args){
        PriorityQueue priorityQueue=new PriorityQueue();
        priorityQueue.add(4);
        priorityQueue.add(3);
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(6);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.peek());

        Interval interval =new Interval(1,2);
        Interval interval1=new Interval(1,2);
        System.out.println(interval.hashCode());
        System.out.println(interval1.hashCode());
        System.out.println(interval==interval1);
        System.out.println(interval.equals(interval1));
}
}
