package com.example.GckExample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/abc")
	public String abc() {
		
		return "Response is from Rest controller";
	}

}
