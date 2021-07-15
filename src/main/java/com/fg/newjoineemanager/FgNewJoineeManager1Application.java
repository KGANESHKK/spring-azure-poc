package com.fg.newjoineemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FgNewJoineeManager1Application {

	@GetMapping("/messaging")
	public String message() {

		return "Congrats ! POC succedded in Azure.";
	}

	public static void main(String[] args) {
		SpringApplication.run(FgNewJoineeManager1Application.class, args);
	}

}
