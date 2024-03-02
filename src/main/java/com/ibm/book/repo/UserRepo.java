package com.ibm.book.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.book.entity.User;


@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	
	public List<User> findByUserNameAndUserPassword(String userName,String userPassword);

}
