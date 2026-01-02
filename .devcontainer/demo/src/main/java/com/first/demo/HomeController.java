package com.first.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController{
	
	@GetMapping("/")
	public String home() {
		return "Spring Boot is running ✅";
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello from Gitpod!";
	}
}
