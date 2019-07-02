//package com.example.algorithm.moredatasource.config;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.sql.DataSource;
//
///**
// * Created by IDEA
// * author:wangzhou
// * Date:2019/6/3
// * Time:11:19
// **/
//@Configuration
//@ComponentScan
//@EnableTransactionManagement
//public class DataSourceConfig {
//
//    @Bean(name = "primaryDataSource")
//    @Qualifier("primaryDataSource")
//    @ConfigurationProperties(prefix="spring.primarydatasource")
//
//    public DataSource primaryDataSource(){
//        return DataSourceBuilder.create().build();
//    }
//    @Bean(name = "secondDataSource")
//    @Qualifier("secondDataSource")
//    @ConfigurationProperties(prefix="spring.seconddatasource")
//    public DataSource secondaryDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//}
