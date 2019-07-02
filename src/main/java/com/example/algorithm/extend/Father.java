package com.example.algorithm.extend;

import lombok.Data;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/4
 * Time:14:06
 **/

public class Father {

    public final String name;

    public Father() {
        name = "";
    }

    public static void main(String[] args) {
        Father father = new Father();
        Father father1 = new Father();
        
        System.out.println(father.equals(father1));
    }
}
