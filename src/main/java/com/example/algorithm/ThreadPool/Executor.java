package com.example.algorithm.ThreadPool;

import com.example.algorithm.task.CodingTask;
import com.example.algorithm.task.decorator.LoggingRunnable;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/10
 * Time:17:44
 **/
public class Executor {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        List<Future<?> > futureResults=new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            futureResults.add(executorService.submit(new CodingTask())) ;
        }
        System.out.println("finished");
        for (Future<?>  futureResult:futureResults) {
            //等待futureResult的结束
            System.out.println(futureResult.get());
        }
        System.out.println("all finished");
        executorService.shutdown();
    }
}
