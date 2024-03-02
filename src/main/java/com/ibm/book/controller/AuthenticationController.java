package com.ibm.book.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.book.entity.User;
import com.ibm.book.service.AuthService;
import com.ibm.book.service.UserService;

@RestController
@CrossOrigin("*")
public class AuthenticationController {
	
	@Autowired
	AuthService authService;
    
//	
//    @PostMapping("/login")
//    public ResponseEntity<Map<String, String>> authRequest(@RequestBody User user) {
//    	
//    	return authService.login(user);
//        log.info("AuthResource.authRequest start {}", authRequestDto);
//        var userRegistrationResponse = authService.authRequest(authRequestDto);
//        log.info("AuthResource.authRequest end {}", userRegistrationResponse);
//        return new ResponseEntity<>(userRegistrationResponse, HttpStatus.OK);
    }

	

