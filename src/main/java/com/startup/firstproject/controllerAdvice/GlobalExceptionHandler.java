package com.startup.firstproject.controllerAdvice;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.startup.firstproject.dtos.ExceptionHandlerDTO;
import com.startup.firstproject.exceptions.ProductNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ArithmeticException.class)
	public ResponseEntity<String> handleArithmeticException() {
		
		ResponseEntity<String> response = new ResponseEntity<>("Arithmetic expression occured",
				HttpStatus.BAD_GATEWAY);
		
		return response;

	}
	
	@ExceptionHandler(ArithmeticException.class)
	public ResponseEntity<ExceptionHandlerDTO> handleArithmeticExceptionusingDTO() {
		
		ExceptionHandlerDTO exceptionHandlerDTO = new ExceptionHandlerDTO();
		exceptionHandlerDTO.setMsg("something went wrong");
		exceptionHandlerDTO.setSolution("I dont know try on your own");
		
		ResponseEntity<ExceptionHandlerDTO> response = new ResponseEntity<>(
				exceptionHandlerDTO,
				HttpStatus.BAD_GATEWAY);
		
		return response;

	}
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<ExceptionHandlerDTO> handleProductNotFoundException(){
		
		ExceptionHandlerDTO exceptionHandlerDTO = new ExceptionHandlerDTO();
		exceptionHandlerDTO.setMsg("something went wrong");
		exceptionHandlerDTO.setSolution("I dont know try on your own");
		
		ResponseEntity<ExceptionHandlerDTO> response = new ResponseEntity<>(
				exceptionHandlerDTO,
				HttpStatus.BAD_GATEWAY);
		
		return response;
		
	}
	
	
}
