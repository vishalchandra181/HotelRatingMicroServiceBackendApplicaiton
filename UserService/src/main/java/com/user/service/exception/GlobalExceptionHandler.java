package com.user.service.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.user.service.payload.ApiResponse;


@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@Autowired
	ApiResponse response;
    // @when there is ResourceNotFoundException accur and this method should Run ;
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException ex)
	{
		String message=ex.getMessage();
		
		// this is for ApiResponse.java put all getter and setter using lombok
	//    ApiResponse response=ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
	  response.setMessage(message);  
	  response.setSuccess(true);
	  response.setStatus(HttpStatus.NOT_FOUND);
	    
	  return new ResponseEntity<ApiResponse>(response,HttpStatus.NOT_FOUND);
	}
}