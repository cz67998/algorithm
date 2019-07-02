package com.example.algorithm.task.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/9
 * Time:11:26
 **/
public class MyMessageFactory implements IMyMessageFactory {
    @Override
    public IMyMessage create(String messageType) {
        IMyMessage iMyMessage;
        switch (messageType) {
            case "SMS":
                iMyMessage = new MyMessageSms();
                iMyMessage.getMessageParam().put("PHONENUM", "123456789");
                return iMyMessage;
            case "OA":
                iMyMessage = new MyMessageOaTodo();
                iMyMessage.getMessageParam().put("OAUSERNAME", "testUser");
                return iMyMessage;
            case "EMAIL":
                iMyMessage = new MyMessageEmail();
                iMyMessage.getMessageParam().put("EMAIL", "test@test.com");
                return iMyMessage;
            default:
                iMyMessage = new MyMessageEmail();
                iMyMessage.getMessageParam().put("EMAIL", "test@test.com");
                return iMyMessage;
        }
    }
}
