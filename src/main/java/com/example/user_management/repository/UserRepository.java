package com.example.user_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.user_management.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}

