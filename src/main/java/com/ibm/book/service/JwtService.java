package com.ibm.book.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.ibm.book.entity.User;

@Service
public interface JwtService {
	 boolean isTokenValid(String token, User user);
	 String extractUsername(String token);
	String generateToken(Map<String, Object> extraClaims, String userName);
}
