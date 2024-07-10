package org.dnyanyog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImageMain {
	
	public static void main(String[] args)
	{
		for(String s:args)
		{
			System.out.println("Received Param ="+s);
		}
		SpringApplication.run(ImageMain.class, args);
	}
	
}
