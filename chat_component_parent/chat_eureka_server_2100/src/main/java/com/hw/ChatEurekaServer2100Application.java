package com.hw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ChatEurekaServer2100Application {

    public static void main(String[] args) {
        SpringApplication.run(ChatEurekaServer2100Application.class, args);
    }

}
