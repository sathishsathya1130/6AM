package com.sathish.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sathish.model.SsnEnrollmentRequest;
import com.sathish.service.SsaService;

@RestController
public class SsnEnrollmentRestController {

	@Autowired
	private SsaService ssaService;

	@PostMapping
	          (value="/ssnEnrollment",
	                    consumes = "application/json"
	                      )
	public ResponseEntity<String> enroll(@RequestBody SsnEnrollmentRequest request) {

		ResponseEntity<String> response = null;

		String ssn = ssaService.ssnEnrollment(request);

		String body = "your Ssn Enrollement completed sucessfully.your ssn:" + ssn;

		response = new ResponseEntity<>(body, HttpStatus.CREATED);
		
		return response;
	}

}
