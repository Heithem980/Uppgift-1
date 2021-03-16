package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class Calculate {
	
	@RequestMapping(method = RequestMethod.GET, path ="/")
	public String index() {
		
		return "<h1>Welcome to THIS!</h1>";
		
	}
	
	@RequestMapping(method = RequestMethod.GET, value ="/add2")
	public String addition (int num) {
		
		int sum = num + 2;
		
		return num +"+<h3> 2 </h3>= "+ sum;
		
	}
	
	@RequestMapping(method = RequestMethod.GET, value ="/divideBy2")
	public String divition (int num) {
		
		
		
		double sum = (double)num / 2;
		
		return num +"/<h3> 2 </h3>= "+ sum;
		
	}
	
	@RequestMapping(method = RequestMethod.GET, value ="/multiplyBy2")
	public String multiplication (int num) {
		
		int sum = num * 2;
		
		return num +"*<h3> 2 </h3>= "+ sum;
		
	}
	
	

}
