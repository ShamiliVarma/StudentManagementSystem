INSERT INTO STUDENT (studentId,firstName,lastName,address,emailId) VALUES('S0000001','John','Smith','115 Norman Rd QLD 4701','John_Smith@abc.com');
INSERT INTO STUDENT (studentId,firstName,lastName,address,emailId) VALUES('S0000002','Greg','Chapel','550 Huntington Hill Dr Cumming GA 30001','Greg_Chapel@abc.com');
INSERT INTO STUDENT (studentId,firstName,lastName,address,emailId) VALUES('S0000003','Esha','Bella','65 Barrat Station Kirkwood MO 63588','Esha_Bella@abc.com');
INSERT INTO STUDENT (studentId,firstName,lastName,address,emailId) VALUES('S0000004','Judi','Colman','111 Stefen Ave ValleyPark MO 67401','Judi_Colman@abc.com');
INSERT INTO STUDENT (studentId,firstName,lastName,address,emailId) VALUES('S0000005','Ruth','Abney','777 S New Ballas MO 63211','Ruth_Abney@abc.com');
INSERT INTO STUDENT (studentId,firstName,lastName,address,emailId) VALUES('S0000006','Maagie','Nuber','636 DutchMill Dr MO 58963','Maagie_Nuber@abc.com');
INSERT INTO STUDENT (studentId,firstName,lastName,address,emailId) VALUES('S0000008','Vernon','Suttle','314 Page Ave Chesterfield MO 45698','Vernon_Suttle@abc.com');
INSERT INTO STUDENT (studentId,firstName,lastName,address,emailId) VALUES('S0000009','Paul','Fosu','899 Carman Trails Desperes MO 69852','Paul_Fosu@abc.com');
INSERT INTO STUDENT (studentId,firstName,lastName,address,emailId) VALUES('S0000010','Tina','Cassadie','1615 sunsetHills Kirkwood MO 63585','Tina_Cassadie@abc.com');
INSERT INTO STUDENT (studentId,firstName,lastName,address,emailId) VALUES('S0000012','Raman','Jatta','915 Ladue MO 63211','Raman_Jatta@abc.com');
INSERT INTO STUDENT (studentId,firstName,lastName,address,emailId) VALUES('S0000013','Karan','Colman','1315 Staunt Rd QLD 4701','Karan_Colman@abc.com');

INSERT INTO UNITS (unitCode,unitName,level,terms) VALUES('COIT202011','Distributed Syestems : Principles and Development','Level 3','Term 1,Term 2,Term 3');
INSERT INTO UNITS (unitCode,unitName,level,terms) VALUES('COIT202012','Data Science','Level 2','Term 2,Term 3');
INSERT INTO UNITS (unitCode,unitName,level,terms) VALUES('COIT202013','Application Development','Level 1','Term 1,Term 3');
INSERT INTO UNITS (unitCode,unitName,level,terms) VALUES('COIT202018','Business Analysis','Level 3','Term 1,Term 2,Term 3');
INSERT INTO UNITS (unitCode,unitName,level,terms) VALUES('COIT202019','Database Design and Implementation','Level 2','Term 1,Term 2');

INSERT INTO ENROLMENT (studentId,unitCode) VALUES('S0000001','COIT202011');
INSERT INTO ENROLMENT (studentId,unitCode) VALUES('S0000001','COIT202013');
INSERT INTO ENROLMENT (studentId,unitCode) VALUES('S0000001','COIT202019');
INSERT INTO ENROLMENT (studentId,unitCode) VALUES('S0000002','COIT202011');
INSERT INTO ENROLMENT (studentId,unitCode) VALUES('S0000002','COIT202012');
INSERT INTO ENROLMENT (studentId,unitCode) VALUES('S0000003','COIT202011');
INSERT INTO ENROLMENT (studentId,unitCode) VALUES('S0000003','COIT202018');
INSERT INTO ENROLMENT (studentId,unitCode) VALUES('S0000003','COIT202019');
INSERT INTO ENROLMENT (studentId,unitCode) VALUES('S0000004','COIT202011');
INSERT INTO ENROLMENT (studentId,unitCode) VALUES('S0000004','COIT202012');
INSERT INTO ENROLMENT (studentId,unitCode) VALUES('S0000004','COIT202018');
INSERT INTO ENROLMENT (studentId,unitCode) VALUES('S0000005','COIT202012');
INSERT INTO ENROLMENT (studentId,unitCode) VALUES('S0000005','COIT202013');
INSERT INTO ENROLMENT (studentId,unitCode) VALUES('S0000006','COIT202012');
INSERT INTO ENROLMENT (studentId,unitCode) VALUES('S0000006','COIT202018');
INSERT INTO ENROLMENT (studentId,unitCode) VALUES('S0000006','COIT202019');
INSERT INTO ENROLMENT (studentId,unitCode) VALUES('S0000008','COIT202011');
INSERT INTO ENROLMENT (studentId,unitCode) VALUES('S0000008','COIT202012');
INSERT INTO ENROLMENT (studentId,unitCode) VALUES('S0000009','COIT202011');
INSERT INTO ENROLMENT (studentId,unitCode) VALUES('S0000009','COIT202013');
INSERT INTO ENROLMENT (studentId,unitCode) VALUES('S0000009','COIT202018');
INSERT INTO ENROLMENT (studentId,unitCode) VALUES('S0000010','COIT202012');
INSERT INTO ENROLMENT (studentId,unitCode) VALUES('S0000010','COIT202019');
INSERT INTO ENROLMENT (studentId,unitCode) VALUES('S0000012','COIT202013');
INSERT INTO ENROLMENT (studentId,unitCode) VALUES('S0000012','COIT202018');
INSERT INTO ENROLMENT (studentId,unitCode) VALUES('S0000012','COIT202019');
INSERT INTO ENROLMENT (studentId,unitCode) VALUES('S0000013','COIT202011');
INSERT INTO ENROLMENT (studentId,unitCode) VALUES('S0000013','COIT202013');
INSERT INTO ENROLMENT (studentId,unitCode) VALUES('S0000013','COIT202019');