package com.ibm.book.service;

import com.ibm.book.entity.User;

public interface AuthService {
	
	String login(User user);
	String register(User user);

}
