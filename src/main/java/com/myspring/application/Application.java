package com.myspring.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class Application {

    public static void main(String[] args) {
        SpringApplication application =
                new SpringApplication(Application.class);
        application.run(args);
    }
}
