package com.java.studentmanagement.bean;

public class Unit {
    private String unitCode;
    private String unitName;
    private String level;
    private String terms;
    
    private String errorMessage;
    
    public Unit(String unitCode, String unitName, String level, String terms) {
        this.unitCode = unitCode;
        this.unitName = unitName;
        this.level = level;
        this.terms = terms;
    }
    public Unit() {
    	
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
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
