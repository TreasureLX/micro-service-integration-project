package com.lx.micro.service.user.web.controller;

import com.lx.micro.service.user.api.entity.User;
import com.lx.micro.service.user.api.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lanxing
 */
@RestController
public class UserController {

    @Reference(check = false,version = "${demo.service.version}")
    private UserService userService;

    @GetMapping("getUser")
    public User getUser(){
        return userService.getUser();
    }
}
