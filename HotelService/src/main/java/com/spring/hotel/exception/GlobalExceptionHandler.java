package com.spring.hotel.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class GlobalExceptionHandler {
	
	
	public ResponseEntity<Map<String,Object>> notFoundHandler(ResourceNotFoundException ex){
        Map<String,Object>map=new HashMap<>();
        map.put("message", ex.getMessage());
        map.put("success",false);
        map.put("status", HttpStatus.NOT_FOUND);
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);	
	}

}
