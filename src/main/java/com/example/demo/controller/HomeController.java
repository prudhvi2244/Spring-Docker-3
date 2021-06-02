package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping(value = "/home")
	public String getHomePage() {
		String msg = "<h2 style='color:blue;text-align:center'>Welcome To AWS Elastic Container Service</h2>";
		return msg;
	}

}
