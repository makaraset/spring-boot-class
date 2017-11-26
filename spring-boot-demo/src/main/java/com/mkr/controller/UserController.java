package com.mkr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
		
		return "/user/user";
	}
	
	@RequestMapping("/user/detail")
	public String userDetail(@RequestParam(name="id") int id, Model model) {
		User user = userService.findById(id);
		model.addAttribute("user", user);
		return "user/userdetail";
	}
	
	@RequestMapping("/user/{id}")
	public String userMore(@PathVariable(name="id") int id, Model model) {
		User user = userService.findById(id);
		model.addAttribute("user", user);
		return "user/userdetail";
	}
	
//	@RequestMapping(value = "user/add" , method = RequestMethod.GET )
	@GetMapping("user/add")
	public String goAddUser(Model model) {
		model.addAttribute("actionstat", true);
		model.addAttribute("user", new User() );
		return "user/adduser";
	}
	
//	@RequestMapping(value = "user/add" , method = RequestMethod.POST )
	@PostMapping("user/add")
	public String addUser(User user) {
		System.out.println(user);
		userService.addUser(user);
		return "redirect:/user";
	}
	
//	@RequestMapping(value = "user/edit", method = RequestMethod.GET)
	@GetMapping("user/edit")
	public String goUpdateUser(Model model,@RequestParam("id") int id) {
		model.addAttribute("actionstat", false);
		User user = userService.findById(id);
		model.addAttribute("user", user );
		return "user/adduser";
	}
	
//	@RequestMapping(value = "user/edit", method = RequestMethod.POST)
	@PostMapping("user/edit")
	public String updateUser(User user) {
		System.out.println(user);
		userService.updateUser(user);
		return "redirect:/user";
	}
	
//	@RequestMapping(value="user/remove")
	@PostMapping("user/remove")
	public String removeUser(@RequestParam(name="id") Integer id) {
		System.out.println(id);
		User user = userService.findById(id);
		System.out.println(user);
		userService.delete(id);
		return "redirect:/user";
	}
	
}
