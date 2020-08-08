package com.sathish.repos;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sathish.entity.SsnMasterEntity;

public interface SsnMasterRepository extends JpaRepository<SsnMasterEntity, Serializable> {

	public SsnMasterEntity findBySsnAndStateName(String ssn, String stateName);

}
