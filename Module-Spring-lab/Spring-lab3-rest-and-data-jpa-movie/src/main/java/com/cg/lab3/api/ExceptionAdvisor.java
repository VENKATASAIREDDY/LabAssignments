package com.cg.lab3.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.lab3.Exception.MoviesException;

@RestControllerAdvice
public class ExceptionAdvisor {

	@ExceptionHandler(MoviesException.class)
	public ResponseEntity<String> handleEmployeeExceptionAction(MoviesException excep) {
		return new ResponseEntity<>(excep.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleExceptionAction(Exception excep) {
		return new ResponseEntity<>(excep.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
