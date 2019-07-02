package com.example.algorithm.task.factory.build;

import com.example.algorithm.extend.Engineer;
import com.example.algorithm.extend.Manager;
import com.example.algorithm.extend.Role;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

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

    public void dowork() {
        role.dowork();
    }

    public void saySomeThing() {
        role.sayRole();
    }

    public static class Builder {
        private BigDecimal salary;
        private String name;
        private Role role;
        private Employee employee;

        public Builder fromingExisting(Employee employee) {
            this.employee = employee;
            return this;
        }

        public Builder setSlary(BigDecimal salary) {
            this.salary = salary;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setRole(Role role) {
            this.role = role;
            return this;
        }

        public Builder set() {
            return this;
        }

        public void construct(Employee employee) {
            employee.setName(name);
            employee.setRole(role);
            employee.setSalary(salary);
        }

        public Employee create() {
            Employee employee = new Employee();
            construct(employee);
            return employee;
        }

        public Employee build() {
            return employee;
        }
    }

    public static void main(String[] args) {
        Employee employee = new Builder().setName("Join").
                setSlary(new BigDecimal("10000")).setRole(new Engineer()).
                set().create();
        System.out.println(employee.getName() + " say:");
        employee.saySomeThing();
        employee.dowork();
        Employee employee1 = new Builder().fromingExisting(employee).setRole(new Manager()).
                set().build();
        System.out.println(employee1.getName() + " say:");
        employee1.saySomeThing();
        employee.dowork();
    }

}
