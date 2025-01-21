package com.creatio.crm.langauge.Assignments;

import java.util.HashMap;
import java.util.Map;

public class StudentGrades {
	

	
	Map<String, Character> studentGrades = new HashMap<String, Character>();
	
    public void addNewStudentGrades(String studentName, Character grade) {
        studentGrades.put(studentName, grade);
//        System.out.println(studentGrades);
    }
	
	public void removeStudentGrades(String studentName) {
		studentGrades.remove(studentName);
//		System.out.println(studentGrades);
	}
	
	public void viewStudentGrades(String studentName ) {
		
		System.out.println(studentGrades);

	}
	
	
	


}
