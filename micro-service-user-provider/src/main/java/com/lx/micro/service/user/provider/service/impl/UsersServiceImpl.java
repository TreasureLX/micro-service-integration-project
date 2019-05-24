package com.lx.micro.service.user.provider.service.impl;

import com.lx.micro.service.user.api.entity.User;
import com.lx.micro.service.user.api.service.UserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author lanxing
 */
@Service(version = "${demo.service.version}")
public class UsersServiceImpl implements UserService {

    @Override
    public User getUser() {
        User user=new User();
        user.setName("lanxing");
        user.setAge(24);
        return user;
    }
}
