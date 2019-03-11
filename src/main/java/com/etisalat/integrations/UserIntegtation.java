package com.etisalat.integrations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.etisalat.models.User;
import com.etisalat.repository.UserRepository;
import com.fasterxml.jackson.databind.util.JSONPObject;

@Component
public class UserIntegtation {
	
	@Autowired
	UserRepository userRepo;
	
	
	public Object getUserData(String id) {
		return userRepo.findOne(Long.valueOf(id));
	}
	
	public Object getAllUsers() {
		return userRepo.findAll();
	}

	public Object addUser(User user) {
		return userRepo.save(user);
	}

	public Object deleteUser(String id) {
		if(userRepo.exists(Long.valueOf(id))) {
		    userRepo.delete(Long.valueOf(id)); 
		    return "user is deleted successfully";
		}else {
			return "user is not exist";
		}
	}
	
}
