package com.ibm.book.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.book.entity.User;
import com.ibm.book.repo.UserRepo;
import com.ibm.book.service.AuthService;
import com.ibm.book.service.UserService;

@Service
public class AuthServiceImpl implements AuthService {
	
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	JwtServiceImpl jwtService;
	
	
	
	//@Override
//	public Map<String, String> login(User user) {
//		
//		List<User> users= userRepo.findByUserNameAndUserPassword(user.getUserName(), user.getUserPassword());
//		
//		if(users.size()>=1) {
//			
//			final var token = jwtService.generateToken(Map.of("role", roles), username);
//	        return Map.of("token", token);
//	        
//			return jwtService.generateToken(user.getUserName());
//		}
//		else {
//			return "";
//		}
		
	//}

	@Override
	public String register(User user) {
		
		return null;
	}

	@Override
	public String login(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
