package com.sathish.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sathish.service.SsaService;

@RestController
public class SsnValidationRestController {

	@Autowired
	private SsaService ssaService;

	@GetMapping(value = "validateSsn/{ssn}/{state}")
	public ResponseEntity<String> validate(@PathVariable("ssn") String ssn, @PathVariable("state") String state) {

		ResponseEntity<String> response = null;
		String status = ssaService.CheckEnrollment(ssn, state);
		response = new ResponseEntity<>(status, HttpStatus.OK);
		return response;

	}

}
