package com.dis.mock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dis.mock.service.WelcomeService;

@RestController
public class WelcomeController {

	@Autowired
	private WelcomeService service;

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		return service.sendWelcome();

	}
}
