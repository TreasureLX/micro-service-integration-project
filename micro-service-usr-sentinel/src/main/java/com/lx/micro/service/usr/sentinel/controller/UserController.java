package com.lx.micro.service.usr.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @SentinelResource("hello")
    @RequestMapping("hello")
    public String hello(){
        return "hello world";
    }
}
