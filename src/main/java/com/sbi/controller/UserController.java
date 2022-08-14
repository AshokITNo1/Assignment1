package com.sbi.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbi.serviceImpl.UserServiceImpl;

/**
 * <p>
 *<b>User Controller Class for SBI Application</b>
 *</p>
 */
@RestController
@RequestMapping("/user")
public class UserController {
	
	/**
	 * class variable logger
	 */
	private Logger  logger = Logger.getLogger(UserController.class);
	
	/**
	 * userService autowired
	 */
	@Autowired
	private UserServiceImpl userService;
	
	@GetMapping(value = "/Welcome")
	public String getGreet() {
		String user =userService.getGreetUser();
		return user;
	}


}
