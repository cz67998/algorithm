package com.example.algorithm.task.factory.build;

import java.util.Locale;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/9
 * Time:14:45
 **/
public class ComputerBuilder implements Builder {
    private Computer computer=new Computer();

    @Override
    public void setBoard(String board) {
        computer.setMBoard(board);
    }

    @Override
    public void setDisplay(String display) {
      computer.setMDisplay(display);
    }

    @Override
    public void setOs(String os) {
     computer.setMOS(os);
    }

    @Override
    public Computer create() {
        return computer;
    }
}
