package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AlianRepo;
import com.example.demo.model.Alian;

@Controller

public class HelloController {



	@Autowired
 AlianRepo repo;
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
		
	
	
	
	
	@RequestMapping("/addAlian")
	public String addAlian(Alian alian) {
		repo.save(alian);
		return "home.jsp";
	}
}
