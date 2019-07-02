package com.example.algorithm.extend;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/8
 * Time:14:35
 **/
@Data
public class Engineer implements Role {

    @Override
    public void dowork() {
        System.out.println("dowork");
    }

    @Override
    public void sayRole() {
        System.out.println("I am Engineer ");
    }
}
