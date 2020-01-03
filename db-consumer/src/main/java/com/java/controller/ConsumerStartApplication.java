package com.java.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.java.controller","com.java.service.impl"})
public class ConsumerStartApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerStartApplication.class);
    }
}
