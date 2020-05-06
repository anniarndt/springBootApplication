package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	
	@RequestMapping("/annika")
	public String index2() {
		return "Greetings Test Page!";
	}

	public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}
