package com.spring.hotel.exception;

@SuppressWarnings("serial")
public class ResourceNotFoundException extends RuntimeException {
	
	
	public ResourceNotFoundException(String s) {
		super(s);
	}
	
	public ResourceNotFoundException() {
		super("Resource not found..!!");
	}
	
	

}
