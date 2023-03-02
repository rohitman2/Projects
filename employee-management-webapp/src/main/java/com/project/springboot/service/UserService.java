package com.project.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.project.springboot.dto.UserRegistrationDto;
import com.project.springboot.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}