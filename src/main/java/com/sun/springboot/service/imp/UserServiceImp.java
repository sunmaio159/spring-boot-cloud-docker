package com.sun.springboot.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.sun.springboot.mapper.UserMapper;
import com.sun.springboot.po.User;
import com.sun.springboot.service.UserService;

@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	@Override
	@Cacheable(value="UserCach",key="'user.getAllUsers'")
	public List<User> getAllUsers() {
		return userMapper.getAllUsers();
	}
	
	@CacheEvict(value="UserCach",key="'user.getAllUsers'")
	public void deleteUser(Integer id) {
		userMapper.deleteUser(id);
	}
	
}
