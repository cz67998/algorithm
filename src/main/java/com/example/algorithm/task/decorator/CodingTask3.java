package com.example.algorithm.task.decorator;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/9
 * Time:11:10
 **/
public class CodingTask3 implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
    }
}
