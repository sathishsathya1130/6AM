package com.sathish.service;

import java.util.List;

import com.sathish.entity.StateMasterEntity;
import com.sathish.model.SsnEnrollmentRequest;

public interface SsaService {
	
	public List<StateMasterEntity> getAllStateNames();
		
	public String ssnEnrollment(SsnEnrollmentRequest req);
	
	public String CheckEnrollment(String ssn,String StateName);

	
	

}
