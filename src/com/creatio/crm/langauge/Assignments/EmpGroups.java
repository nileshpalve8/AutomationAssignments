package com.creatio.crm.langauge.Assignments;

public class EmpGroups {

	public static void main(String[] args) {
		/* Then, create another class called EmpGroups that contains two arrays to store the employee names
		and IDs.*/
		
		Employees obj = new Employees();
		String[] empName = new String[3];
		
		empName[0] = obj.empname1;
		empName[1] = obj.empname2;
		empName[2] = obj.empname3;
		
		int[]empid = new int[3];
		empid[0] = obj.empId1;
		empid[1] = obj.empId2;
		empid[2] = obj.empId3;
		
		/*Retrieve the data from the Employees class, store it in these arrays, and finally print each employee's
		name along with their corresponding ID.
		Example:
		• Employee Name: Bharath, Employee ID: 1234*/
		
		System.out.println("Employee Name:" + empName[0] + "," + "Employee Id:" + empid[0]);
		System.out.println("Employee Name:" + empName[1] + "," + "Employee Id:" + empid[1]);
		System.out.println("Employee Name:" + empName[2] + "," + "Employee Id:" + empid[2]);
		

	}

}
