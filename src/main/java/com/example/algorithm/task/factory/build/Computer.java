package com.example.algorithm.task.factory.build;

import lombok.Data;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/9
 * Time:14:43
 **/
@Data
public class Computer {
    private String mBoard;
    private String mDisplay;
    private String mOS;
    public static class MyBuilder {
        private String mBoard;
        private String mDisplay;
        private String mOS;

        public MyBuilder setBoard(String board) {
            this.mBoard = board;
            return this;
        }

        public MyBuilder setDisplay(String display) {
            this.mDisplay = display;
            return this;
        }

        public MyBuilder setOs(String mOS) {
            this.mOS=mOS;
            return this;
        }
        public MyBuilder set() {
            return this;
        }
        private void construct(Computer computer) {
            computer.setMBoard(mBoard);
            computer.setMDisplay(mDisplay);
            computer.setMOS(mOS);
        }

        public Computer create() {
            Computer computer = new Computer();
            construct(computer);
            return computer;
        }
    }
    public static void main(String[] args){
    Computer computer=new Computer.MyBuilder().setBoard("因特尔主板").
            setDisplay("三星显示器").set().create();
        System.out.println(computer.getMBoard());
    }
}
