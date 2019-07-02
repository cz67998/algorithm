//package com.example.algorithm.moredatasource.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
//import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.transaction.PlatformTransactionManager;
//
//import javax.persistence.EntityManager;
//import javax.sql.DataSource;
//import java.util.Map;
//
///**
// * Created by IDEA
// * author:wangzhou
// * Date:2019/6/3
// * Time:11:14
// **/
//@Configuration
//@EnableJpaRepositories(
//        entityManagerFactoryRef = "entityManagerFactorySecondary",
//        transactionManagerRef = "transactionManagerSecondary",
//        basePackages = {"com.example.algorithm.moredatasource.domain2"}) //设置Repository所在位置
//public class SecondConfig {
//    @Autowired
//    @Qualifier("secondDataSource")
//    private DataSource secondDataSource;
//
//    @Primary
//    @Bean(name = "entityManagerSecondary")
//    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
//        return entityManagerFactoryPrimary(builder).getObject().createEntityManager();
//    }
//
//    @Primary
//    @Bean(name = "entityManagerFactorySecondary")
//    public LocalContainerEntityManagerFactoryBean entityManagerFactoryPrimary(EntityManagerFactoryBuilder builder) {
//        return builder
//                .dataSource(secondDataSource)
//                .properties(getVendorProperties())
//                .packages("com.example.algorithm.moredatasource.domain2") //设置实体类所在位置
//                .persistenceUnit("secondaryPersistenceUnit")
//                .build();
//    }
//
//    @Autowired
//    private JpaProperties jpaProperties;
//
//    private Map<String, String> getVendorProperties() {
//        return jpaProperties.getProperties();
//    }
//
//    @Primary
//    @Bean(name = "transactionManagerSecondary")
//    public PlatformTransactionManager transactionManagerPrimary(EntityManagerFactoryBuilder builder) {
//        return new JpaTransactionManager(entityManagerFactoryPrimary(builder).getObject());
//    }
//}
