package com.lldd.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.lldd"})
public class GatewayBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayBootApplication.class,args);
    }
}
