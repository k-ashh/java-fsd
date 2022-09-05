package com.example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class DemoController {

	@ResponseBody
	@RequestMapping("/login")
	public String login(HttpServletRequest request,HttpServletResponse response) {
		Authentication au=new Authentication();
		return au.Authenticate(request.getParameter("user"), request.getParameter("pwd"));		
	}
}
