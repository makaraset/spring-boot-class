package com.mkr.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import model.User;

@Repository
public class UserRepositoryImpl implements UserRepository {

	private List<User> users = new ArrayList<>();
	
	public UserRepositoryImpl() {
		for(int i=0;i<10;i++) {
			User user = new User(i+1, "User-" + (i+1), i<5?"F":"M", "User-" + (i+1) + ".jpg");
			users.add(user);
		}
		
	}

	@Override
	public List<User> findAll(){
		
		return users;
	}
	
	@Override
	public User findById(int id) {
		
		for(User user: users) {
			if(user.getId()==id) {
				return user;
			}
		}
		
		return null;
	}

	@Override
	public boolean addUser(User user) {
		
		return users.add(user);
		
	}
	
	
	@Override
	public boolean delete(int id) {
		
		for(User user: users) {
			if (user.getId() == id) {
				return users.remove(user); 
			}
		}
		
		return false;
		
	}

	@Override
	public boolean updateUser(User user) {
		for(int i= 0; i < users.size(); i++) {
			if (users.get(i).getId() == user.getId()) {
				users.set(i, user);
				return true;
			}
		}
		return false;
	}
	
}
