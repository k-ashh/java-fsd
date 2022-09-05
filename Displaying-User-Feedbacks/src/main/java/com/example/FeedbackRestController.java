package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeedbackRestController {
@Autowired
	FeedbackDAO dao;
	
@PostMapping("/insert")
	public Feedback insert(@RequestBody Feedback f) {
	System.out.println(f.getComment() + "    "+ f.getUname());
		return dao.insert(f);
	}

@GetMapping("/getall")
public List<Feedback> getall(){
	return dao.getall();
}

@DeleteMapping("/delete/{id}")
public String delete(@PathVariable  int id) {
	 return dao.delete(id);
}


}

