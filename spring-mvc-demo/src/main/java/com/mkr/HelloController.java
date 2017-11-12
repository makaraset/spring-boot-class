package com.mkr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	@RequestMapping(value = "/msg/{name}/{classRoom}", method = RequestMethod.GET)
	public String printHello(ModelMap model, @PathVariable("name") String name,
			@PathVariable("classRoom") String classRoom) {
		model.addAttribute("msg", "Hello Spring MVC Framework!");
		model.addAttribute("name", name);
		model.addAttribute("classRoom", classRoom);

		return "hello";
	}

}