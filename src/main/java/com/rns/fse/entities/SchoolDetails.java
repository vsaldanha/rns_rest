package com.rns.fse.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "school_details", schema = "rns")
public class SchoolDetails {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "school_id")
	private String id;
	
	@Column(name = "school_name")
	private String schoolName;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "ph_number")
	private String phNumber;

	@Column(name = "principal")
	private String principal;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoonName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhNumber() {
		return phNumber;
	}

	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}

	public String getPrincipal() {
		return principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	

}
