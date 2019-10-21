CREATE TABLE STUDENT (
	studentId varchar(10) NOT NULL,
	firstName varchar(20) NOT NULL,
	lastName varchar(20) NOT NULL,
	address varchar(100) NOT NULL,
	emailId varchar(100) NOT NULL,
 	PRIMARY KEY (studentId)
);

CREATE TABLE UNITS (
	unitCode varchar(15) NOT NULL,
	unitName varchar(100) NOT NULL,
 	level varchar(10) NOT NULL,
	terms varchar(50) NOT NULL,
  	PRIMARY KEY (unitCode)
);

CREATE TABLE ENROLMENT (
	studentId varchar(10) NOT NULL,
	unitCode varchar(15) NOT NULL,
  	PRIMARY KEY (studentId,unitCode),
  	FOREIGN KEY (studentId) REFERENCES STUDENT(studentId),
  	FOREIGN KEY (unitCode) REFERENCES UNITS(unitCode)
);