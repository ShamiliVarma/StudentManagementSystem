package com.java.studentmanagement.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.java.studentmanagement.entity.StudentEntity;
import com.java.studentmanagement.entity.UnitEntity;

@Component
public class StudentDAO {
    
	@Autowired
    private SessionFactory sessionFactory;
	/**
	 * 
	 * @param studentId
	 * @return instance of StudentEntity for given studentId
	 */
    public StudentEntity getContactDetails(String studentId) {
    	Session session = sessionFactory.getCurrentSession();
    	return (StudentEntity) session.get(StudentEntity.class, studentId);
    }

    /**
     * 
     * @param unitCode
     * @return instance of UnitEntity for given unitCode
     */
    public UnitEntity getUnitDetails(String unitCode) {
    	Session session = sessionFactory.getCurrentSession();
    	return (UnitEntity) session.get(UnitEntity.class, unitCode);
    }
}
