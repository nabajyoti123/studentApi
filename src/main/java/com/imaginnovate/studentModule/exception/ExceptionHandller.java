package com.imaginnovate.studentModule.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandller {
	
//	@ResponseStatus(code=HttpStatus.BAD_REQUEST)
//	@ExceptionHandler(MethodArgumentNotValidException.class)
//	public Map<String, String> handleValidationExceptions(
//	  MethodArgumentNotValidException ex) {
//	    Map<String, String> errors = new HashMap<>();
//	    ex.getBindingResult().getAllErrors().forEach((error) -> {
//	        String fieldName = ((FieldError) error).getField();
//	        String errorMessage = error.getDefaultMessage();
//	        errors.put(fieldName, errorMessage);
//	    });
//	    return errors;
//	}
}
