package com.example.awslambdamysql.awslambdamysqldemo.repository;

import com.example.awslambdamysql.awslambdamysqldemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
