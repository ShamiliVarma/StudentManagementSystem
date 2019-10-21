package com.java.studentmanagement.controller;

import java.util.Scanner;

import com.java.studentmanagement.service.StudentService;

public class QueryServerImpl {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int selection = 0;
        boolean checkSelection = true;
        StudentService studentService = new StudentService();
        while(checkSelection) {
            checkSelection = false;
            System.out.println("Select the query type : {1 or 2 or 3}");
            System.out.println("1. Student Contact Details");
            System.out.println("2. Student Enrolled Units");
            System.out.println("3. Unit Details");
            selection = scanner.nextInt();
            if (selection == 1) {
                String studentId = null;
                System.out.println("Enter StudentId.");
                studentId = scanner.next();
                System.out.println(studentService.getContactDetails(studentId));
            }else if (selection == 2) {
                String studentId = null;
                System.out.println("Enter StudentId.");
                studentId = scanner.next();
                System.out.println(studentService.getEnrolledUnits(studentId));
            }else if (selection == 3) {
                System.out.println("Enter Unit Code.");
                String unitCode = scanner.next();
                System.out.println(studentService.getUnitDetails(unitCode));
            } else {
                checkSelection = true;
                System.out.println("Please enter a valid number.");
            }
        }
        scanner.close();
    }
}
