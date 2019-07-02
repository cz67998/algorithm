package com.example.algorithm.task;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/8
 * Time:21:38
 **/
public abstract class LoggingRunnable implements  Runnable {
    public abstract  void doRun();
    @Override
    public void run() {
        long startTime=System.currentTimeMillis();
        System.out.println(startTime);
        doRun();
        System.out.println(System.currentTimeMillis()-startTime);
    }
}
