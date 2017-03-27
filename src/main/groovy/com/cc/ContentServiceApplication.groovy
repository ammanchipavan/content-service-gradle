package com.cc

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.context.annotation.PropertySource

@PropertySource("classpath:application.properties")
@SpringBootApplication
@EnableDiscoveryClient
class ContentServiceApplication {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "content-service");
        SpringApplication.run(ContentServiceApplication.class, args);
    }
}
