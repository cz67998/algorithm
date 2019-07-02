package com.example.algorithm.moredatasource.domain1;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/6/3
 * Time:9:09
 **/
@Entity
@Data
@Table(name="t_user")
public class User {
    @Id
    private int id;
    private String name;
    private int age;
    public User(String name, int age){
        this.name=name;
        this.age=age;
    }
}
