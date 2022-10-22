package com.example.awslambdamysql.awslambdamysqldemo.service;

import com.example.awslambdamysql.awslambdamysqldemo.model.User;
import com.example.awslambdamysql.awslambdamysqldemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User create(User user) {
        return userRepository.save(user);
    }
}
