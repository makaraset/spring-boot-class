package com.mkr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mkr.service.UserService;

import model.User;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/user")
	public String userPage(Model model) {

		List<User> users = userService.findAll();
		
		model.addAttribute("users", users);
		
		return "user";
	}
	
	@RequestMapping("/user/detail")
	public String userDetail(@RequestParam(name="id") int id, Model model) {
		User user = userService.findById(id);
		model.addAttribute("user", user);
		return "userdetail";
	}
	
	@RequestMapping("/user/{id}")
	public String userMore(@PathVariable(name="id") int id, Model model) {
		User user = userService.findById(id);
		model.addAttribute("user", user);
		return "userdetail";
	}
}
