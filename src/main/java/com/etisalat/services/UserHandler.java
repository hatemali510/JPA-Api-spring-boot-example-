package com.etisalat.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.etisalat.integrations.UserIntegtation;
import com.etisalat.models.User;

@Component
public class UserHandler {
	
	@Autowired
	UserIntegtation userIntegtation;
	
	public Object getUser(String id) {
		return userIntegtation.getUserData(id);
	}
	
	public Object getAll() {
		return userIntegtation.getAllUsers();
	}

	public Object addUser(User user ) {
		return userIntegtation.addUser(user);
	}

	public Object deleteUser(String id) {
		// TODO Auto-generated method stub
		return userIntegtation.deleteUser(id);
	}
}
