package com.java.studentmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.studentmanagement.bean.Student;
import com.java.studentmanagement.bean.Unit;
import com.java.studentmanagement.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;

	/**
	 * 
	 * @param studentId : String
	 * @return Student
	 * 
	 *  This method calls the getContactDetails method from studentService class
	 *  by passing the studentId
	 *  It has GET Mapping with studentID present as path variable
	 */
	@RequestMapping(value = "/contactDetails/{studentId}", method = RequestMethod.GET)
	public Student getContactDetails(@PathVariable String studentId) {
		return studentService.getContactDetails(studentId);
	}
	/**
	 * 
	 * @param studentId : String
	 * @return List<Student>
	 * 
	 *  This method calls the getEnrolledUnits method from studentService class
	 *  by passing the studentId
	 *  It has GET Mapping with studentID present as path variable
	 */
	@RequestMapping(value = "/enrolledUnits/{studentId}", method = RequestMethod.GET)
	public List<String> getEnrolledUnits(@PathVariable String studentId) {
		return studentService.getEnrolledUnits(studentId);
	}
	/**
	 * 
	 * @param unitCode : String
	 * @return Unit
	 * 
	 *  This method calls the getUnitDetails method from studentService class
	 *  by passing the unitCode
	 *  It has GET Mapping with unitCode present as path variable
	 */
	@RequestMapping(value = "/unitDetails/{unitCode}", method = RequestMethod.GET)
	public Unit getUnitDetails(@PathVariable String unitCode) {
		return studentService.getUnitDetails(unitCode);
	}
}
