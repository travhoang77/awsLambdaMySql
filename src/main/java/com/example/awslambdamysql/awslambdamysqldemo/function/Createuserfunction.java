package com.example.awslambdamysql.awslambdamysqldemo.function;

import com.example.awslambdamysql.awslambdamysqldemo.model.User;
import com.example.awslambdamysql.awslambdamysqldemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.UUID;
import java.util.function.Function;

@Component
public class Createuserfunction implements Function<Map<String, String>, User> {

    @Autowired
    private UserService userService;

    @Override
    public User apply(Map<String, String> stringStringMap) {
       User newUser = new User();
       newUser.setFirstName(stringStringMap.get("firstName"));
       newUser.setLastName(stringStringMap.get("lastName"));
       newUser.setEmail(stringStringMap.get("email"));

       return userService.create(newUser);
    }
}
