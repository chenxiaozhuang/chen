package com.tckj.tckj.user.dao;


import com.tckj.tckj.user.entity.User;

public interface UserMapper {

	public User findByName(String name);
	
	public User findById(Integer id);
}
