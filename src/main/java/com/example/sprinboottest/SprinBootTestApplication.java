package com.example.sprinboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@ComponentScan("com.example.controller")
@EntityScan("com.example.model")
@EnableJpaRepositories("com.example.dao")
public class SprinBootTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SprinBootTestApplication.class, args);
    }


}


