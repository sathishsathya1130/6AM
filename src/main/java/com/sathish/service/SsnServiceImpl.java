package com.sathish.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathish.entity.SsnMasterEntity;
import com.sathish.entity.StateMasterEntity;
import com.sathish.exceptions.InvalidEnrollmentFoundException;
import com.sathish.exceptions.NoEnrollmentFoundException;
import com.sathish.model.SsnEnrollmentRequest;
import com.sathish.repos.SsnMasterRepository;
import com.sathish.repos.StateMasterRepository;

@Service
public class SsnServiceImpl implements SsaService {  

	@Autowired
	private SsnMasterRepository ssnRepo;

	@Autowired
	private StateMasterRepository statesRepo;

	@Override
	public List<StateMasterEntity> getAllStateNames() {
		return statesRepo.findStateNames();
	}

	@Override
	public String ssnEnrollment(SsnEnrollmentRequest req) {

		SsnMasterEntity entity = new SsnMasterEntity();
		BeanUtils.copyProperties(req, entity);
		SsnMasterEntity savedEntity = ssnRepo.save(entity);
		if (savedEntity != null) {
			return savedEntity.getSsn();
		}

		else {
			throw new NoEnrollmentFoundException("No enrollment has done");
		}
		/* return null; */
	}

	@Override
	public String CheckEnrollment(String ssn, String stateName) {
		SsnMasterEntity entity=ssnRepo.findBySsnAndStateName(ssn,stateName);
		if(entity!=null) {
			return "VALID";
		}
		else {
			throw new InvalidEnrollmentFoundException("invalid Enrollment has done");
		}
		/* return "IN-VALID"; */
	}

	

}
