package com.sun.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.sun.springboot.po.User;

@Mapper
public interface UserMapper {
	
	@Select(" select * from user ")
	List<User> getAllUsers();
	
	@Delete(" delete from user where id=#{id} ")
	void deleteUser(Integer id); 
}
