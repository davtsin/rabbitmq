package com.rabbitmq.example3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@EnableAutoConfiguration
@ComponentScan
@Import(RabbitConfiguration3.class)
public class Example1Configuration {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example1Configuration.class, args);
    }
}