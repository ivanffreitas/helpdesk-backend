package com.ivanilson.helpdesk.resource.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ivanilson.helpdesk.services.exceptions.ObjectnotFoundException;
import com.ivanilson.helpdesk.services.exceptions.StandarError;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ObjectnotFoundException.class)
	public ResponseEntity<StandarError> objectnotFoundException(ObjectnotFoundException ex, 
			HttpServletRequest request){
		
		StandarError error = new StandarError(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(),
				"Object Not Found", ex.getMessage(), request.getRequestURI());
	
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}

}
