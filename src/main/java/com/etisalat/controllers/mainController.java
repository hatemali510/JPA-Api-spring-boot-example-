package com.etisalat.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etisalat.models.User;
import com.etisalat.services.UserHandler;
import com.etisalat.utils.Response;

@RestController
@RequestMapping("/api")
public class mainController {

	@Autowired
	UserHandler userHander;
	
	@GetMapping("/hello/{id}")
	public ResponseEntity<Object> sayHello(@PathVariable String id) {
		
		return Response.SendResponse(userHander.getUser(id));
	}
	
	@GetMapping("/")
	public ResponseEntity<Object> sayHello() {
		
		return Response.SendResponse("helo");
	}
	
	@GetMapping("/users")
	public ResponseEntity<Object> Allusers() {
		
		return Response.SendResponse(userHander.getAll());
	}
	@PostMapping("/addUser")
	public ResponseEntity<Object> addUser(@RequestBody User user){
		return Response.SendResponse(userHander.addUser(user));
	}
	@DeleteMapping("/DeleteUser/{id}")
	public String Delete(@PathVariable String id){

		 return  userHander.deleteUser(id).toString();
			
	}
	
}
