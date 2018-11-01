package com.groupware.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.groupware.user.service.UserService;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService service;
	
	@RequestMapping("/login")
	public String login() {
		
		
		return "user/login";
	}
	
	@RequestMapping("/register")
	public String sighup() {		
		
		return "user/register";
	}
}
