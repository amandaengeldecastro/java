package com.mvc.system.service;

import java.util.List;

import com.mvc.system.entity.User;

public interface UserService {

	public List<User> getAllUsers();	
	
	public User saveUser(User user);

	public User getById(int id);

	public void deleteById(int id);
}
