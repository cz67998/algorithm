package com.example.algorithm.moredatasource;

import com.example.algorithm.moredatasource.domain1.User;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/6/3
 * Time:11:34
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserRepository1Test {
//    @Autowired
//    private UserRepository1 userRepository1;
    @Autowired
    @Qualifier("primaryJdbcTemplate")
    protected JdbcTemplate jdbcTemplate1;

    @Autowired
    @Qualifier("secondaryJdbcTemplate")
    protected JdbcTemplate jdbcTemplate2;
    @Test
    public void Test() {
        // 往第一个数据源中插入两条数据
        jdbcTemplate1.update("insert into t_user(id,name,age) values(?, ?, ?)", 1, "aaa", 20);
        jdbcTemplate1.update("insert into t_user(id,name,age) values(?, ?, ?)", 2, "bbb", 30);
        jdbcTemplate2.update("insert into t_user(id,name,age) values(?, ?, ?)", 1, "aaa", 20);
        jdbcTemplate2.update("insert into t_user(id,name,age) values(?, ?, ?)", 2, "bbb", 30);

    }
}