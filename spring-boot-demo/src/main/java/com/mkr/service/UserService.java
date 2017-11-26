package com.mkr.service;

import java.util.List;

import model.User;

public interface UserService {
	
	public List<User> findAll();
	
	public User findById(int id);
	
	public void addUser(User user);
	
	public void updateUser(User user);
	
	public void delete(int id);

}
