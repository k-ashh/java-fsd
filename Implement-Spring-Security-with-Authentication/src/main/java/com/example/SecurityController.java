package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SecurityController {
@ResponseBody
	@RequestMapping("/")
	public String demo() {
		return "Hi Users... This is the main page!!!!";
	}
@ResponseBody
@RequestMapping("/admin")
public String admin() {
	return "Hi Admin User... This is Admin page!!!!";
}

@ResponseBody
@RequestMapping("/user")
public String user() {
	return "Hi Users... This is general user page!!!!";
}


	
}

