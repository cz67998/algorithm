package com.example.algorithm.task.decorator;

import com.example.algorithm.task.factory.TaskFactory;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/8
 * Time:21:45
 **/
public class TransactionRunnable implements Runnable {
    private Runnable runnable;

    public TransactionRunnable(Runnable runnable) {
        this.runnable = runnable;
    }

    @Override
    public void run() {
        boolean shouldRoolback = false;
        try {
            beginTransaction();
            runnable.run();
        } catch (Exception e) {
            shouldRoolback = true;
            throw e;
        } finally {
            if (shouldRoolback) {
                rollback();
            } else {
                commit();
            }
        }
    }

    private void commit() {
        System.out.println("commit");
    }

    private void rollback() {
        System.out.println("rollback");
    }

    private void beginTransaction() {
        System.out.println("beginTransaction");
    }

    public static void main(String[] args) {
        new TransactionRunnable(new LoggingRunnable(TaskFactory.create(1))).run();
    }
}
