package com.example.algorithm.lock;

import java.math.BigDecimal;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/10
 * Time:10:30
 **/

public class DeadLock5 implements Runnable {

    private Account accountA;
    private Account accountB;
    private  Object lock=new Object();
    public DeadLock5(Account accountA, Account accountB) {
        this.accountA = accountA;
        this.accountB = accountB;
    }

    @Override
    public void run() {
        synchronized (lock) {
            try {
                System.out.println(1);
                accountA.setAcount(new BigDecimal(1));
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (accountB) {
                System.out.println(2);
                accountB.setAcount(new BigDecimal(1));
                System.out.println(3);
            }
        }
    }


    public static void main(String[] args) {
        Account accountA = new Account("1");
        Account accountB = new Account("2");
        new Thread(new DeadLock5(accountA, accountB)).start();
        new Thread(new DeadLock5(accountB, accountA)).start();
    }

}
