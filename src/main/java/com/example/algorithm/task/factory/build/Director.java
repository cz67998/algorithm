package com.example.algorithm.task.factory.build;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/9
 * Time:14:48
 **/
public class Director {
    private Builder mBuilder;

    public Director(Builder builder) {
        this.mBuilder = builder;
    }

    public void construct(String board, String display, String os) {
        mBuilder.setBoard(board);
        mBuilder.setDisplay(display);
        mBuilder.setOs(os);
    }

    public static void main(String[] args) {
        Builder builder = new ComputerBuilder();
        Director director = new Director(builder);
        director.construct("因特尔主板", "三星显示器", "windows");
        Computer computer = builder.create();
        System.out.println(computer.getMBoard());

    }
}
