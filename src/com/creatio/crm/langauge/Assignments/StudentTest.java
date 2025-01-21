package com.creatio.crm.langauge.Assignments;

public class StudentTest {

	public static void main(String[] args) {
		StudentGrades obj = new StudentGrades();
		
		obj.addNewStudentGrades("Nilesh", 'A');
		obj.addNewStudentGrades("Ganesh", 'B');
		obj.addNewStudentGrades("Rakesh", 'C');
		
//		obj.removeStudentGrades("Rakesh");

		obj.viewStudentGrades("Nilesh");

	}

}
