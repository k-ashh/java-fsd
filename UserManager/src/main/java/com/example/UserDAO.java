package com.example;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class UserDAO {
	
	private HibernateTemplate temp;

	public void setTemp(HibernateTemplate temp) {
		this.temp = temp;
	}
	
	//update,delete
	public int insert(User u) {
		return (Integer) temp.save(u);
	}
	
	//retrieve
	public List<User> getall(){
		String sql="from User";
		return (List<User>) temp.find(sql);
	}

	public int update(User u) {
		// TODO Auto-generated method stub
		temp.update(u);
		return 1;
	}

	public List<User> search(int j) {
		// TODO Auto-generated method stub
		String sql="from User where uid= "+j;
		return (List<User>) temp.find(sql);
	}
	
	

}

