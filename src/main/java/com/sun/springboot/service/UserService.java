package com.sun.springboot.service;

import java.util.List;

import com.sun.springboot.po.User;

public interface UserService {
	List<User> getAllUsers();
	
	void deleteUser(Integer id);
}
