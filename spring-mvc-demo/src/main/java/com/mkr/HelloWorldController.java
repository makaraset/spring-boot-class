package com.mkr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

	@RequestMapping("/home")
	@ResponseBody
	public String hello() {
		return "Hello spring mvc home page!";
	}

	@RequestMapping("/hello")
	public String helloWorld() {
		System.out.println("Hello spring mvc");
		return "test";
	}
}
