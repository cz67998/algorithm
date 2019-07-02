package com.example.algorithm.task.decorator;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/8
 * Time:21:38
 **/
public class LoggingRunnable implements Runnable {
    private Runnable runnable;

    public LoggingRunnable(Runnable runnable) {
        this.runnable = runnable;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        runnable.run();
        System.out.println(System.currentTimeMillis() - startTime);
    }

    public static void main(String[] args) {
        new LoggingRunnable(new CodingTask()).run();
    }
}
