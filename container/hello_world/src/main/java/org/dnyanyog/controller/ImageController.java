package org.dnyanyog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {
	
	@GetMapping("/")
	public String print()
	{
		System.out.println("Get Request Called at /");
        return "nginx Image html Page";
		
	}
	
}
