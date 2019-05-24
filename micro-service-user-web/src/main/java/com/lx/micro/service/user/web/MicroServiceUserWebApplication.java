package com.lx.micro.service.user.web;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author lanxing
 */
@SpringBootApplication
@Configuration
@EnableDubbo(scanBasePackages = "com.lx.micro.service.user.web.controller")
@PropertySource("classpath:dubbo-consumer.properties")
public class MicroServiceUserWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceUserWebApplication.class, args);
    }

}
