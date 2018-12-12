package com.practise.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.practise.**.service")
@SpringBootApplication
public class PractiseWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PractiseWebApplication.class, args);
    }
}
