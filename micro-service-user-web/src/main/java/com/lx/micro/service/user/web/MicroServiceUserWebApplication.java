package com.lx.micro.service.user.web;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lanxing
 */
@SpringBootApplication
@NacosPropertySource(dataId = "example", autoRefreshed = true)
public class MicroServiceUserWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceUserWebApplication.class, args);
    }

}
