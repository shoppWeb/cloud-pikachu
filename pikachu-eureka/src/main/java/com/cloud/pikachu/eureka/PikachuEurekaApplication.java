package com.cloud.pikachu.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PikachuEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PikachuEurekaApplication.class, args);
    }

}

