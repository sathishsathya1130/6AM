package com.sathish.repos;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sathish.entity.StateMasterEntity;

public interface StateMasterRepository 
             extends  JpaRepository<StateMasterEntity, Serializable> {
	
	@Query(value="select STATE_NAME from STATE_MASTER",nativeQuery = true)
	public List<StateMasterEntity> findStateNames();

	

}
