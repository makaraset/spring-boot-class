package com.mkr.repository;

import java.util.List;

import model.User;

public interface UserRepository {
	
	public List<User> findAll();
	
	public User findById(int id);
	
	public boolean addUser(User user);
	
	public boolean updateUser(User user);
	
	public boolean delete(int id);
}
