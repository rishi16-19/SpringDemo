package com.ibm.book.service;

import java.util.List;

import com.ibm.book.entity.User;


public interface UserService {
	
	List<User> findAll();
	User findById(int id);
	void save(User user);
	void put(User user);
	void deleteById(int id);
}
