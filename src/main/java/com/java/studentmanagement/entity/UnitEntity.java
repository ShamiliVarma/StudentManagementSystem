package com.java.studentmanagement.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity(name = "UNITS")
public class UnitEntity {
	@Id
	@Column
	private String unitCode;
	@Column
	private String unitName;
	@Column
	private String level;
	@Column
	private String terms;
	
	@ManyToMany(mappedBy = "units",fetch = FetchType.LAZY)
	private Set<StudentEntity> studentsEnroled;
	
	public Set<StudentEntity> getStudentsEnroled() {
		return studentsEnroled;
	}
	public void setStudentsEnroled(Set<StudentEntity> studentsEnroled) {
		this.studentsEnroled = studentsEnroled;
	}
	public String getUnitCode() {
		return unitCode;
	}
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getTerms() {
		return terms;
	}
	public void setTerms(String terms) {
		this.terms = terms;
	}
	
}
