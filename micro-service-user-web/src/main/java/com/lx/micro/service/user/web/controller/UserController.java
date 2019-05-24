package com.lx.micro.service.user.web.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.lx.micro.service.user.api.entity.User;
import com.lx.micro.service.user.api.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author lanxing
 */
@RestController
public class UserController {

    @Reference(check = false,version = "${demo.service.version}")
    private UserService userService;

    @NacosValue(value = "${useLocalCache:false}", autoRefreshed = true)
    private boolean useLocalCache;

    @RequestMapping(value = "/get", method = GET)
    @ResponseBody
    public boolean get() {
        return useLocalCache;
    }

    @GetMapping("getUser")
    public User getUser(){
        return userService.getUser();
    }
}
