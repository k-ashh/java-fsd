package com.example;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@RequestMapping("/insert")
	public ModelAndView insert(HttpServletRequest req,HttpServletResponse res) {
		ModelAndView mv=new ModelAndView();
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		User u=ac.getBean(User.class);
		u.setUname(req.getParameter("name"));
		u.setUpassword(req.getParameter("pwd"));
		UserDAO dao=ac.getBean(UserDAO.class);
		int row=dao.insert(u);
		
		if(row>0) {
			mv.setViewName("display.jsp");
		}
		return mv;
	}
	
	
	@RequestMapping("/getall")
	public ModelAndView getall(HttpServletRequest req,HttpServletResponse res) {
		ModelAndView mv=new ModelAndView();
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		User s=ac.getBean(User.class);
		UserDAO dao=ac.getBean(UserDAO.class);
		List<User> usr=dao.getall();
		mv.setViewName("displayall.jsp");
		mv.addObject("user", usr);
		return mv;
	}
	@RequestMapping("/update")
	public ModelAndView update(HttpServletRequest req,HttpServletResponse res) {
		ModelAndView mv=new ModelAndView();
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		User u=ac.getBean(User.class);
		u.setUid(Integer.parseInt(req.getParameter("id")));
		u.setUname(req.getParameter("name"));
		u.setUpassword(req.getParameter("pwd"));
		UserDAO dao=ac.getBean(UserDAO.class);
		int row=dao.update(u);
		
		if(row>0) {
			mv.setViewName("display.jsp");
		}
		return mv;
	}
	@RequestMapping("/search")
	public ModelAndView search(HttpServletRequest req,HttpServletResponse res) {
		ModelAndView mv=new ModelAndView();
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		User u=ac.getBean(User.class);
		int j= Integer.parseInt(req.getParameter("id"));
		UserDAO dao=ac.getBean(UserDAO.class);
		List<User> usr=dao.search(j);
		mv.setViewName("displayall.jsp");
		mv.addObject("user", usr);
		return mv;
	}
	
	
}


