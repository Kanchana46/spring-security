package com.code.sapp;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.sapp.model.User;


public interface UserRepository extends JpaRepository<User, String> {
	User findByUsername(String username);
}
