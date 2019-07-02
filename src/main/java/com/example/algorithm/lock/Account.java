package com.example.algorithm.lock;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/10
 * Time:11:12
 **/
@Data
public class Account {
    private String accountId;
    private BigDecimal acount;
    public Account (String accountId){
        this.accountId=accountId;
    }

}
