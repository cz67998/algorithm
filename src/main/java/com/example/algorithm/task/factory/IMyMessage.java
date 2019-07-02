package com.example.algorithm.task.factory;

import java.util.Map;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/9
 * Time:11:19
 **/
public interface IMyMessage {
    public Map<String,Object> getMessageParam();
    public void setMessageParm(Map<String,Object> messageParm);
    public void sendMessage() throws Exception;
}
