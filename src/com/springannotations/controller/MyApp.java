package com.springannotations.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyApp {
	

	@RequestMapping(value="/login",method=RequestMethod.POST )
	public String login(HttpServletRequest request,HttpServletResponse responce){
		System.out.println("------------------------------->");
		
		return "success";
	}
	
}
