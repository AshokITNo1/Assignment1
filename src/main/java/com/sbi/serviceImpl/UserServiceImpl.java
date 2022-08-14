package com.sbi.serviceImpl;
import org.springframework.stereotype.Service;
import com.sbi.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	public String getGreetUser()
	{
		return "Welcome to SBI .. Come Again!!";
	}

}
