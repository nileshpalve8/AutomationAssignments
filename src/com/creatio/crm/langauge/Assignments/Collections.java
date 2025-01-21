package com.creatio.crm.langauge.Assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collections {

	public static void main(String[] args) {
		/* Problem statement:
		Inside this Excel There are 3 TestCases with each Testcase having 3 rows of data. Now, Create List<String,
		Map<String,String>> to store all the data and Print the data from Product details > Supplier Name > Office Depot
		from the Map<String, Map<String,String>>  */
		
		//StudentMap1
		
		System.out.println("*************** student1Map ***************");
		Map<String,String > student1Map = new HashMap<String,String>();
		student1Map.put("Name","John Doe");
		student1Map.put("Age","20");
		student1Map.put("Gender","Male");
		student1Map.put("Roll Number","S12345");
		student1Map.put("Grade","A");
		student1Map.put("Major","Computer Science");
		student1Map.put("GPA","3.8");
		student1Map.put("Email","john@example.com");
		student1Map.put("Contact Number","9999997777");
		student1Map.put("Address","123Elm St");
		
		System.out.println("Total Values in student1Map are :"+student1Map.size());
		System.out.println(student1Map);
		
		//StudentMap2
		
		System.out.println("*************** student2Map ***************");
		Map<String,String > student2Map = new HashMap<String,String>();
		student2Map.put("Name","Jane Smith");
		student2Map.put("Age","21");
		student2Map.put("Gender","Female");
		student2Map.put("Roll Number","S12346");
		student2Map.put("Grade","B");
		student2Map.put("Major","Mathematics");
		student2Map.put("GPA","3.5");
		student2Map.put("Email","jane@example.com");
		student2Map.put("Contact Number","9876665666");
		student2Map.put("Address","456 Oak St");
		
		System.out.println("Total Values in student2Map are :"+student2Map.size());
		System.out.println(student2Map);
		
		//StudentMap3
		
		System.out.println("*************** student3Map ***************");
		Map<String,String > student3Map = new HashMap<String,String>();
		student3Map.put("Name","Mike Brown");
		student3Map.put("Age","22");
		student3Map.put("Gender","Male");
		student3Map.put("Roll Number","S12347");
		student3Map.put("Grade","A");
		student3Map.put("Major","Physics");
		student3Map.put("GPA","3.9");
		student3Map.put("Email","mike@example.com");
		student3Map.put("Contact Number","8787876546");
		student3Map.put("Address","789 Pine St");
		
		System.out.println("Total Values in student3Map are :"+student3Map.size());
		System.out.println(student3Map);
		
		
		List<Map<String,String >> studentList = new ArrayList<Map<String,String >>();
		studentList.add(student1Map);
		studentList.add(student2Map);
		studentList.add(student3Map);
		
		System.out.println("Student List:" +studentList);
		
		
		//employee1Map
		
		System.out.println("*************** employee1Map ***************");
		Map<String,String > employee1Map = new HashMap<String,String>();
		employee1Map.put("Employee ID", "E001");
		employee1Map.put("Name", "Alice Green");
		employee1Map.put("Age", "30");
		employee1Map.put("Gender", "Female");
		employee1Map.put("Department", "Engineering");
		employee1Map.put("Position", "Software Engineer");
		employee1Map.put("Salary", "75000");
		employee1Map.put("Email", "alice@example.com");
		employee1Map.put("Contact Number", "9876543213");
		
		System.out.println("Total Values in employee1Map are:" +employee1Map.size());
		System.out.println(employee1Map);
		
		//employee2Map
		
		System.out.println("*************** employee2Map ***************");
		Map<String,String > employee2Map = new HashMap<String,String>();
		employee2Map.put("Employee ID", "E002");
		employee2Map.put("Name", "Bob Jhonson");
		employee2Map.put("Age", "35");
		employee2Map.put("Gender", "Male");
		employee2Map.put("Department", "Marketing");
		employee2Map.put("Position", "Marketing Manager");
		employee2Map.put("Salary", "85000");
		employee2Map.put("Email", "bob@example.com");
		employee2Map.put("Contact Number", "9876543214");
		
		System.out.println("Total Values in employee2Map are:" +employee2Map.size());
		System.out.println(employee2Map);
		
		//employee3Map
		
		System.out.println("*************** employee3Map ***************");
		Map<String,String > employee3Map = new HashMap<String,String>();
		employee3Map.put("Employee ID", "E003");
		employee3Map.put("Name", "Carol White");
		employee3Map.put("Age", "28");
		employee3Map.put("Gender", "female");
		employee3Map.put("Department", "Sales");
		employee3Map.put("Position", "Sales Executive");
		employee3Map.put("Salary", "65000");
		employee3Map.put("Email", "carol@example.com");
		employee3Map.put("Contact Number", "9876543214");
		
		System.out.println("Total Values in employee3Map are:" +employee3Map.size());
		System.out.println(employee3Map);
		
		List<Map<String,String>> employeeList = new ArrayList<Map<String,String>>();
		employeeList.add(employee1Map);
		employeeList.add(employee2Map);
		employeeList.add(employee3Map);
		
		System.out.println("Total Values in Employee List are:" +employeeList.size());
		System.out.println(employeeList);
		
		//product1Map
		System.out.println("*************** product1Map ***************");
		Map<String,String> product1Map = new HashMap<String,String>();
		product1Map.put("Product ID","P001");
		product1Map.put("Name","Laptop");
		product1Map.put("Category","Electronics");
		product1Map.put("Price","$1,200");
		product1Map.put("Stock Quantity","50");
		product1Map.put("Supplier","Tech Supples");
		product1Map.put("Warranty","2 years");
		product1Map.put("Rating","4.5");
		product1Map.put("Manufacturing Date","15-01-2023");
		product1Map.put("Expiry Date","15-01-2025");
		
		System.out.println("Total Values in product1Map:" +product1Map.size());
		System.out.println(product1Map);
		
		//product2Map
		System.out.println("*************** product2Map ***************");
		Map<String,String> product2Map = new HashMap<String,String>();
		product2Map.put("Product ID","P002");
		product2Map.put("Name","Desk Chair");
		product2Map.put("Category","Furniture");
		product2Map.put("Price","$150");
		product2Map.put("Stock Quantity","200");
		product2Map.put("Supplier","Office Depot");
		product2Map.put("Warranty","1 years");
		product2Map.put("Rating","4");
		product2Map.put("Manufacturing Date","10-02-2023");
		product2Map.put("Expiry Date","N/A");
		
		System.out.println("Total Values in product2Map:" +product2Map.size());
		System.out.println(product2Map);
		
		//product3Map
		System.out.println("*************** product3Map ***************");
		Map<String,String> product3Map = new HashMap<String,String>();
		product3Map.put("Product ID","P003");
		product3Map.put("Name","Coffee Maker");
		product3Map.put("Category","Kitchen");
		product3Map.put("Price","$75");
		product3Map.put("Stock Quantity","100");
		product3Map.put("Supplier","Kitchen World");
		product3Map.put("Warranty","6 Months");
		product3Map.put("Rating","4.2");
		product3Map.put("Manufacturing Date","20-03-2023");
		product3Map.put("Expiry Date","20-03-2024");
		
		System.out.println("Total Values in product3Map:" +product3Map.size());
		System.out.println(product3Map);
		
		List<Map<String,String>> productList = new ArrayList<Map<String,String>>();
		productList.add(product1Map);
		productList.add(product2Map);
		productList.add(product3Map);
		
		System.out.println("Product List:" +productList.size());
		System.out.println(productList);
		
		//Create List<String,Map<String,String>> to store all the data
		Map<String,List<Map<String,String>>> Data = new HashMap<String,List<Map<String,String>>>();
		Data.put("StudentList:", studentList);
		Data.put("EmployeeList:", employeeList);
		Data.put("ProductList:", productList);
		
		System.out.println(Data);
		
		//Print the data from Product details > Supplier Name > Office Depot from the Map<String, Map<String,String>>
		
	
		System.out.println(" Supplier Name : " + Data.get("ProductList:").get(1).get("Supplier"));
//		System.out.println(" Supplier Name : " + Data.get("productList"));

	}

}
