package com.example;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackDAO {
//automatically it is going to generate a refernce to the object
	@Autowired
	FeedbackRepo repo;
	
	public Feedback insert(Feedback e) {
		return repo.save(e);
	}
	
		
	public List<Feedback> getall(){
		return repo.findAll();
	}
	
	public Feedback getbyid(int id) {
		return repo.getById(null);
	}

	
	public String delete(int id) {
		 repo.deleteById(id);
		 return "deleted the id "+id;
	}
}
