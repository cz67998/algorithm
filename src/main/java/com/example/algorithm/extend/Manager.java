package com.example.algorithm.extend;

import lombok.Data;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/8
 * Time:14:02
 **/
@Data
public class Manager implements Role {

    private ArrayList<Employee> employeeArrayList;
    public Manager(ArrayList<Employee> employeeArrayList){
        this.employeeArrayList=employeeArrayList;
    }
    public Manager(){

    }

    @Override
    public void dowork() {
        System.out.println("dowork");
    }

    @Override
    public void sayRole() {
        System.out.println("I am manager ");
    }
}
