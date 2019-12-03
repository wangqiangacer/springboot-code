package com.example.demo;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import javax.jms.Queue;

@SpringBootApplication(scanBasePackages = "com.example.demo")

class DemoApplication1 {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication1.class, args);
    }

}
