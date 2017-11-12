package com.mkr.springbootdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HolloController {

	@RequestMapping(value = { "/home", "/index", "/" })
	public String indexPage() {
		return "index";
	}

	@RequestMapping("/about")
	public String aboutPage() {
		return "about";
	}

	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		return "This is test text";
	}

	@RequestMapping("/user")
	@ResponseBody
	public String getUser(@RequestParam(name = "name", required = false, defaultValue = "KSHRD") String name) {
		return "Hello " + name;
	}

	@RequestMapping("/client/{client}/{country}")
	@ResponseBody
	public String getClient(@PathVariable(name = "client") String client,
			@PathVariable(name = "country") String country, 
			@RequestParam("balance") Double balance) {
		return "Client: " + client + 
				", they are come from: " + country + ", Remaining balance: " + balance;
	}

}
