package com.van.spring.boot.vanam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vanam")
public class VanamController {

	@GetMapping("/test")
	public String hello() {
		
		return "Welcome to spring boot world";
	}
}
