package com.example.algorithm.lock;

import java.math.BigDecimal;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/10
 * Time:11:30
 **/
public class DeadLock4 implements Runnable {
    private Account accountA;
    private Account accountB;
    private final static Lock lock1 = new ReentrantLock(true);
    private final static Lock lock2 = new ReentrantLock(true);

    public DeadLock4(Account accountA, Account accountB) {
        this.accountA = accountA;
        this.accountB = accountB;
    }

    @Override
    public void run() {

        try {
            lock1.lockInterruptibly();
            accountA.setAcount(new BigDecimal(1));
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+"：已成功获取 lock1  ...");
            try {

                lock2.lockInterruptibly();
                accountB.setAcount(new BigDecimal(1));
                System.out.println(Thread.currentThread().getName()+"：已成功获取 lock2 ...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock2.unlock();
            }

        } catch (InterruptedException e1) {
            e1.printStackTrace();
        } finally {
            lock1.unlock();
        }

    }


    public static void main(String[] args) {
        Account accountA = new Account("1");
        Account accountB = new Account("2");
        new Thread(new DeadLock4(accountA, accountB)).start();
        new Thread(new DeadLock4(accountB, accountA)).start();
    }
}
