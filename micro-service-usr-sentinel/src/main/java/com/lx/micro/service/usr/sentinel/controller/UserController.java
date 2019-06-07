package com.lx.micro.service.usr.sentinel.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lanxing
 */
@RestController
public class UserController {

    @RequestMapping("hello")
    public String hello(){
        return "hello world";
    }
}
