package com.lx.micro.service.user.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * @author lanxing
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.lx.micro.service.user.provider.service.impl")
@PropertySource("classpath:dubbo-provider.properties")
public class MicroServiceUserProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceUserProviderApplication.class, args);
    }

}
