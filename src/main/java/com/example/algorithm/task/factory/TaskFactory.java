package com.example.algorithm.task.factory;

import com.example.algorithm.task.decorator.CodingTask;
import com.example.algorithm.task.decorator.CodingTask2;
import com.example.algorithm.task.decorator.CodingTask3;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/9
 * Time:9:31
 **/
public class TaskFactory {
    public static final int TYPE_CODE = 1;//codingTask
    public static final int TYPE_LOG = 2;//loggingRunnable
    public static final int TYPE_TRANSACTION = 3;//TransactionRunnable

    public static Runnable create(int type) {
        switch (type) {
            case TYPE_CODE:
                return new CodingTask();
            case TYPE_LOG:
                return new CodingTask2();
            case TYPE_TRANSACTION:
                return new CodingTask3();
        }
        return new CodingTask();
    }

    public static void main(String[] args) {

    }
}

