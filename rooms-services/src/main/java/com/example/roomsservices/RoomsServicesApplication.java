package com.example.roomsservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RoomsServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(RoomsServicesApplication.class, args);
    }

}
