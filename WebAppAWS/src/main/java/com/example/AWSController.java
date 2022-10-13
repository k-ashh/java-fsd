package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AWSController {
	@ResponseBody
	@RequestMapping("/")
		public String display() {
			return "This Web Application is Deployoed on AWS...";
		}
}
