package com.java.studentmanagement.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.studentmanagement.bean.Student;
import com.java.studentmanagement.bean.Unit;
import com.java.studentmanagement.dao.StudentDAO;
import com.java.studentmanagement.entity.StudentEntity;
import com.java.studentmanagement.entity.UnitEntity;

@Service
public class StudentService {
	@Autowired
    private StudentDAO studentDAO;
    private String noRecords;
    public StudentService(){
        noRecords = "No record for ";
    }

    /**
     * 
     * @param studentId
     * @return Student
     * 
     * This method calls the getContactDetails method from StudentDAO class
	 *  by passing the studentId
	 *  If the studentId has no records in DB an error message is returned
	 *  else the contact details for the studentId is returned
     */
    @Transactional
    public Student getContactDetails(String studentId) {
        StudentEntity studentDetails = studentDAO.getContactDetails(studentId);
        if(studentDetails!=null){
            System.out.println(studentDetails.getUnits());
            return entityToStudent(studentDetails);
        }else{
        	Student student =new Student();
        	student.setErrorMessage(noRecords+studentId);
        	return student;
        }
    }

    /**
     * 
     * @param studentId
     * @return List<String>
     * 
     * This method calls the getContactDetails method from StudentDAO class
	 *  by passing the studentId
	 *  If the studentId has no records in DB an error message is returned
	 *  else the list of units enrolled for the studentId is returned
     */
    @Transactional
    public List<String> getEnrolledUnits(String studentId) {
    	List<String> enrolledUnits = new ArrayList<String>();
        StudentEntity studentDetails = studentDAO.getContactDetails(studentId);
        if(studentDetails!=null){
        	Set<UnitEntity> unitSet = studentDetails.getUnits();
        	for(UnitEntity unitEntity: unitSet) {
        		enrolledUnits.add(unitEntity.getUnitCode());
        	}
            System.out.println(enrolledUnits.size());
        }else{
        	enrolledUnits.add(noRecords+studentId);
        }
        return enrolledUnits;
    }

    /**
     * 
     * @param unitCode
     * @return Unit
     * 
     * This method calls the getUnitDetails method from StudentDAO class
	 *  by passing the unitCode
	 *  If the unitCode has no records in DB an error message is returned
	 *  else the Unit details for the unitCode is returned
     */
    @Transactional
    public Unit getUnitDetails(String unitCode) {
        UnitEntity unitDetails = studentDAO.getUnitDetails(unitCode);
        if(unitDetails!=null) {
            return entityToUnit(unitDetails);
        }else{
        	Unit unit = new Unit();
        	unit.setErrorMessage(noRecords+unitCode);
            return unit;
        }
    }

    /**
     * 
     * @param studentEntity
     * @return Student
     * 
     * Maps the details from Student Entity into Student 
     */
    private Student entityToStudent(StudentEntity studentEntity) {
    	Student student = new Student();
    	student.setStudentId(studentEntity.getStudentId());
    	student.setFirstName(studentEntity.getFirstName()); 
    	student.setLastName(studentEntity.getLastName());
    	student.setAddress(studentEntity.getAddress());
    	student.setEmailId(studentEntity.getEmailId());
    	return student;
    }

    /**
     * 
     * @param unitEntity
     * @return Unit
     * 
     * Maps the details from Unit Entity into Unit 
     */
    private Unit entityToUnit(UnitEntity unitEntity) {
    	Unit unit = new Unit();
    	unit.setUnitCode(unitEntity.getUnitCode());
    	unit.setUnitName(unitEntity.getUnitName());
    	unit.setLevel(unitEntity.getLevel());
        unit.setTerms(unitEntity.getTerms());
        return unit;
    }
}
