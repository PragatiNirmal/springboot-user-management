package com.example.user_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.user_management.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}

