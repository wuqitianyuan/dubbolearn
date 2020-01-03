package com.java.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(scanBasePackages = {"com.java.controller", "com.java.service.impl"})
@MapperScan(basePackages = {"com.java.mapper"})
public class ProviderOneStartApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderOneStartApplication.class);
    }
}
