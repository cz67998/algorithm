package com.example.algorithm.lock;

import java.math.BigDecimal;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/10
 * Time:11:25
 **/
public class DeadLock1 implements Runnable {
    private Account accountA;
    private Account accountB;

    public DeadLock1(Account accountA, Account accountB) {
        this.accountA = accountA;
        this.accountB = accountB;
    }

    @Override
    public void run() {
        String acountIdA = accountA.getAccountId();
        String acountIdB = accountB.getAccountId();
        String acountId;
        if (Integer.valueOf(acountIdA)> Integer.valueOf(acountIdB)) {
            acountId = acountIdB;
        } else {
            acountId = acountIdA;
        }
        synchronized (acountId) {
            try {
                System.out.println(1);
                accountA.setAcount(new BigDecimal(1));
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (acountId) {
                System.out.println(2);
                accountB.setAcount(new BigDecimal(1));
                System.out.println(3);
            }
        }
    }


    public static void main(String[] args) {
        Account accountA = new Account("1");
        Account accountB = new Account("2");
        new Thread(new DeadLock1(accountA, accountB)).start();
        new Thread(new DeadLock1(accountB, accountA)).start();
    }
}
