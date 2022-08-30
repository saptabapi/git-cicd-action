package com.gitaction.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitactionCicdExampleApplication {
	
	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to gitaction";
	}

	public static void main(String[] args) {
		SpringApplication.run(GitactionCicdExampleApplication.class, args);
	}

}
