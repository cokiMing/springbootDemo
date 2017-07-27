package com.example.demo.example.demo.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by chen on 2017/5/18.
 */
@Component
public class UserProp {

    @Value("${com.example.user}")
    private String userName;
    @Value("${com.example.password}")
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
