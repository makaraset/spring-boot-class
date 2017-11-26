package com.mkr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkr.repository.UserRepository;

import model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository repository;
	
	@Override
	public List<User> findAll(){
		return repository.findAll();
	}
	
	@Override
	public User findById(int id) {
		return repository.findById(id);
	}
	
	@Override
	public void addUser(User user) {
		boolean status = repository.addUser(user);
		if (status) System.out.println("> User added successfully!");
		else System.out.println("> User added failed!");
	}

	@Override
	public void updateUser(User user) {
		boolean status =  repository.updateUser(user);
		if (status) System.out.println("User updated successfully!");
		else System.out.println("User updated failed!");
	}

	@Override
	public void delete(int id) {
		boolean status =  repository.delete(id);
		if (status) System.out.println("User deleted successfully!");
		else System.out.println("User deleted failed!");		
	}
	
}
