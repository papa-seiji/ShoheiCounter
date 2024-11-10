package com.example.shoheicounter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.example.shoheicounter", "com.example.counterapp" })
public class ShoheiCounterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoheiCounterApplication.class, args);
    }
}
