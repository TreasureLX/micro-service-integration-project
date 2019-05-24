package com.lx.micro.service.user.api.entity;

import org.omg.PortableServer.ServantRetentionPolicy;

import java.io.Serializable;

/**
 * @author lanxing
 */
public class User implements Serializable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
