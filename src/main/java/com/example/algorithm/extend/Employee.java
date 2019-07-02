package com.example.algorithm.extend;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/8
 * Time:14:02
 **/
@Data
public class Employee {
    private BigDecimal salary;
    private String name;
    private Role role;
    public Employee(String name, BigDecimal salary,Role role){
        this.salary=salary;
        this.name=name;
        this.role=role;
    }
    public void dowork(){
        role.dowork();
    }
    public  void saySomeThing(){
        role.sayRole();
    }
    public static void main(String[] args){
        ArrayList<Employee> employeeArrayList=new ArrayList<>();
        Employee employee1=new Employee("tom",new BigDecimal("1000"),new Engineer());
        employee1.saySomeThing();
        employee1.dowork();
        employeeArrayList.add(employee1);
        Manager manager=new Manager(employeeArrayList);
        employee1.setRole(new Manager(employeeArrayList));
        employee1.saySomeThing();
        employee1.dowork();
        System.out.println(manager.getEmployeeArrayList().get(0).getName());

    }

}
