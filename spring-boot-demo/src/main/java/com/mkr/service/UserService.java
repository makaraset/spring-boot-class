package com.mkr.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import model.User;

@Service
public class UserService {
	
	private List<User> users = new ArrayList<>();
	
	public UserService() {
		for(int i=0;i<10;i++) {
			User user = new User(i+1, "User-" + (i+1), i<5?"F":"M", "User-" + (i+1) + ".jpg");
			users.add(user);
		}
		
	}

	public List<User> findAll(){
		
		return users;
	}
	
	public User findById(int id) {
		
		for(User user: users) {
			if(user.getId()==id) {
				return user;
			}
		}
		
		return null;
	}
}
