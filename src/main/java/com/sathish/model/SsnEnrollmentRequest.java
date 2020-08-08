package com.sathish.model;

import java.util.Date;

import lombok.Data;

@Data
public class SsnEnrollmentRequest {

	private String fname;

	private String lname;

	private Date dob;

	private String gender;

	private String stateName;

}
