package com.java.studentmanagement.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name = "Student")
public class StudentEntity {
	
	@Id
	@Column
	private String studentId;
	@Column
    private String firstName;
	@Column
    private String lastName;
	@Column
    private String address;
	@Column
    private String emailId;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable(name = "ENROLMENT",joinColumns = {@JoinColumn(name="studentId")},inverseJoinColumns = {@JoinColumn(name="unitCode")})
	private Set<UnitEntity> units;
	
	public Set<UnitEntity> getUnits() {
		return units;
	}
	public void setUnits(Set<UnitEntity> units) {
		this.units = units;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
    
    
}
