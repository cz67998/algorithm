package com.example.algorithm.task.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/9
 * Time:11:32
 **/
public class MyAbstractMessage implements IMyMessage {
    private Map<String, Object> messageParm;
    public MyAbstractMessage(){
        messageParm=new HashMap<>();
    }
    @Override
    public Map<String, Object> getMessageParam() {
        return messageParm;
    }

    @Override
    public void setMessageParm(Map<String, Object> messageParm) {
        this.messageParm = messageParm;
    }

    @Override
    public void sendMessage() throws Exception {
        System.out.println("MyAbstractMessage");
    }
}
