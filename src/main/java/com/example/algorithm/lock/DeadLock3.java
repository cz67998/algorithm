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
public class DeadLock3 implements Runnable {
    private Account accountA;
    private Account accountB;
    private final static Lock lock1 = new ReentrantLock(true);
    private final static Lock lock2 = new ReentrantLock(true);

    public DeadLock3(Account accountA, Account accountB) {
        this.accountA = accountA;
        this.accountB = accountB;
    }

    @Override
    public void run() {

        while (true) {
            try {
                if (lock1.tryLock(10, TimeUnit.MILLISECONDS)) {
                    try {
                        accountA.setAcount(new BigDecimal(1));
                        Thread.sleep(2000);
                        System.out.println(Thread.currentThread().getName()+"：已成功获取 lock1  ...");
                        //如果获取成功则执行业务逻辑，如果获取失败，则释放lock1的锁，自旋重新尝试获得锁
                        if (lock2.tryLock(10, TimeUnit.MILLISECONDS)) {
                            try {
                               accountB.setAcount(new BigDecimal(1));
                                System.out.println(Thread.currentThread().getName()+"：已成功获取 lock2 ...");
                                break;
                            } finally {
                                lock2.unlock();
                            }
                        }
                    } finally {
                        lock1.unlock();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"：获取锁失败，重新获取---");
            try {
                //防止发生活锁
                TimeUnit.NANOSECONDS.sleep(new Random().nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


    public static void main(String[] args) {
        Account accountA = new Account("1");
        Account accountB = new Account("2");
        new Thread(new DeadLock3(accountA, accountB)).start();
        new Thread(new DeadLock3(accountB, accountA)).start();
    }
}
