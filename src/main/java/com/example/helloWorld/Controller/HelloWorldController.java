package com.example.helloWorld.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
class HelloWorldController {

@RequestMapping("/hello")
	public String hello() {
		// TODO Auto-generated method stub
	return("hello world");

	}

}
