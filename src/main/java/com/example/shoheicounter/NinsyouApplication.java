package com.example.shoheicounter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.counterapp")
public class NinsyouApplication {

    public static void main(String[] args) {
        SpringApplication.run(NinsyouApplication.class, args);
    }
}
