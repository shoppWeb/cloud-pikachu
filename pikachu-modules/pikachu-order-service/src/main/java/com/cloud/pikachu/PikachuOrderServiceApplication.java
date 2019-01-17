package com.cloud.pikachu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@EnableDiscoveryClient
public class PikachuOrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PikachuOrderServiceApplication.class, args);
    }


}

