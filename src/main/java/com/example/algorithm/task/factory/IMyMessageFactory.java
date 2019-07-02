package com.example.algorithm.task.factory;

import java.util.Map;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/9
 * Time:11:19
 **/
public interface IMyMessageFactory {
    public  IMyMessage  create(String messageType);
}
