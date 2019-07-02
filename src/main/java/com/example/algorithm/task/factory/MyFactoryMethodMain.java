package com.example.algorithm.task.factory;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/9
 * Time:12:23
 **/
public class MyFactoryMethodMain {
    public static void main(String[] args) throws Exception {
        IMyMessageFactory iMyMessageFactory = new MyMessageFactory();
        IMyMessage myMessage;
        myMessage = iMyMessageFactory.create("SMS");
        myMessage.sendMessage();

        myMessage = iMyMessageFactory.create("OA");
        myMessage.sendMessage();

        myMessage = iMyMessageFactory.create("EMAIL");
        myMessage.sendMessage();


    }
}
