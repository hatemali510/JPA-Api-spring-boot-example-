package com.etisalat.utils;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.etisalat.models.User;

public class Response {
	private  static boolean ValidType(Object DataType) {
		if(DataType instanceof List  || DataType instanceof User) {
			return true;
		}
		return false;
	}
	
	
	public static ResponseEntity SendResponse(Object data){
		if(Response.ValidType(data)) {
			return ResponseEntity.ok().body(data);
		}else {
			return ResponseEntity.noContent().build();
		}
		
	}

}
