package com.dis.mock.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {
	public String sendWelcome() {
		return "welcome to aqheel house";
	}
}
