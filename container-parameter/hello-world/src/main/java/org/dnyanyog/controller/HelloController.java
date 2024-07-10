package org.dnyanyog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/api/v1/vaibhav")
	public String greetingsVaibhav() {
		System.out.println("Get request called at api/v1/vaibhav.");
		return "Hello World !!";
	}
	
	@GetMapping("/")
	public String greetings() {
		System.out.println("Get request called at /");
		return "Hello World !!";
	}
}

