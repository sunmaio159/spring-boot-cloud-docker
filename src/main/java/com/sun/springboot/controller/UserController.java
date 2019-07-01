package com.sun.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.springboot.po.User;
import com.sun.springboot.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/userList")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	@RequestMapping("/delete/{id}")
	public void delete(@PathVariable Integer id) {
		userService.deleteUser(id);
	}
}
