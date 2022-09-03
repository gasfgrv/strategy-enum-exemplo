package com.gusta.example.stategy.enumstrategy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EnumStrategyApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnumStrategyApplication.class, args);
    }

}
