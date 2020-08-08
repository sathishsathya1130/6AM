package com.sathish.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class RestExceptionHnadler {

	@ExceptionHandler(value = NoEnrollmentFoundException.class)
	public ResponseEntity<ApiError> handleNoEnrollmentFoundException() {

		ApiError error = new ApiError(400, "no Enrollment has done", new Date());
		return new ResponseEntity<ApiError>(error, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = InvalidEnrollmentFoundException.class)
	public ResponseEntity<ApiError> handleInvalidEnrollmentFoundException() {

		ApiError error = new ApiError(400, "invalid Enrollment has done", new Date());
		return new ResponseEntity<ApiError>(error, HttpStatus.BAD_REQUEST);
	}

}
