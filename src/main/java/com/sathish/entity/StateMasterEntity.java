package com.sathish.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "STATE_MASTER")
@Entity
public class StateMasterEntity {

	@Id
	@Column(name = "STATE_ID")
	private Integer stateId;
	
	@Column(name = "STATE_NAME")
	private String stateName;
}
