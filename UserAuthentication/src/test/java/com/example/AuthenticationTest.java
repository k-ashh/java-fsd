package com.example;

import static org.junit.Assert.*;

import javax.servlet.http.HttpServletRequest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AuthenticationTest {
	Authentication du;
	@Before
	public void objectcreate() {
		du=new Authentication();
		System.out.println("Class Object Created");
	}

	@Test
	public void test1() {
		System.out.println("Test case 1");
		assertEquals("Login Successfully", du.Authenticate("admin", "admin"));
	}
	@Test
	public void test2() {
		System.out.println("Test case 2");
		assertEquals("Login failed",du.Authenticate("admin", "ADMIN"));
	}
	@Test
	public void test3() {
		System.out.println("Test case 3");
		assertEquals("Login failed", du.Authenticate("user", "password"));
	}
	@Test
	public void test4() {
		System.out.println("Test case 4");
		assertEquals("Login failed", du.Authenticate("adminstrator", "admin"));
	}
	@After
	public void objectremove() {
		du=null;
		System.out.println("Class Object Removed");
	}

}
