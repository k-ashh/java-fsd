package com.example;

public class Authentication {
	public String Authenticate(String username,String password) {
		if(username.equals("admin") && password.equals("admin")) {
			return "Login Successfully";
		}else {
			return "Login failed";
		}
			
	}
}
