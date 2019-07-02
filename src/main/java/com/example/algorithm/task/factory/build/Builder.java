package com.example.algorithm.task.factory.build;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/9
 * Time:14:43
 **/
public interface Builder {
    public void setBoard(String board);
    public void setDisplay(String display);
    public void setOs(String os);
    public Computer create();
}
