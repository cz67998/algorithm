package com.example.algorithm.task.decorator;

import java.util.ArrayList;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/8
 * Time:21:37
 **/
public class CodingTask implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {

        new CodingTask().run();
        ArrayList list=new ArrayList();
        list.add(1);
    }
}
