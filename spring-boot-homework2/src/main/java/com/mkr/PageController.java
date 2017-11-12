package com.mkr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {
	
	@RequestMapping(value= {"/","/home","/index"})
	public String indexPage() {
		
		return "/frontend/index";
		
	}
	
	@RequestMapping("/contact")
	public String contactPage() {
		return "frontend/contact";
	}
	
	@RequestMapping("/contact/{email}")
	@ResponseBody
	public String contact(@PathVariable(name="email") String email, @RequestParam
			(name="name") String name) {
		return "<h1> Hi " + name + " you are contacting us via email " + email +" </h1>";
	}
}
