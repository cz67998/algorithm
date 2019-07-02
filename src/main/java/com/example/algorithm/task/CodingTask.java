package com.example.algorithm.task;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/8
 * Time:21:37
 **/
public class CodingTask  extends LoggingRunnable{
    @Override
    public void doRun() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
    }

    public static void main(String[] args){
     new CodingTask().run();
    }
}
