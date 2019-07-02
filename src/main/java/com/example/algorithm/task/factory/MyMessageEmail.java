package com.example.algorithm.task.factory;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/9
 * Time:11:35
 **/
public class MyMessageEmail extends MyAbstractMessage {
    @Override
    public void sendMessage() throws Exception {
        if (null == getMessageParam() || null == getMessageParam().get("EMAIL") ||
                "".equals(getMessageParam().get("EMAIL"))) {
            throw new Exception("请确认参数");
        }
        System.out.println("我是邮件，发送通知给" + getMessageParam().get("EMAIL"));
    }
}
