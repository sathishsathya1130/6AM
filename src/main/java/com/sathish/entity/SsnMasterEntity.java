package com.sathish.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name="SSN_MASTER")
@Data
public class SsnMasterEntity {

	@Id
	@GenericGenerator(name = "ssn_gen", strategy = "com.sathish.generators.SsnGenerator")
	@GeneratedValue(generator = "ssn_gen")
	@Column(name="SSN")
	private String ssn;

	@Column(name="FIRST_NAME")
	private String fname;

	@Column(name="LAST_NAME")
	private String lname;

	@Column(name="DATE_OF_BIRTH")
	private Date dob;
	
	@Column(name="GENDER")
	private String gender;
	
	@Column(name="STATE_NAME")
	private String stateName;
	
	@CreationTimestamp
	@Column(name = "CREATED_DATE", updatable = false)
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date createdDate;

	@UpdateTimestamp
	@Column(name = "UPDATE_DATE", insertable = false)
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date updatedDate;

}
