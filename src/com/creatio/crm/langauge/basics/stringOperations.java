package com.creatio.crm.langauge.basics;

public class stringOperations {

	public static void main(String[] args) {
		String value =" Username : admin | Password : admin123";
		System.out.println(value);
		System.out.println(value.replaceAll("[0-9]", ""));
		System.out.println(value.toUpperCase());
		System.out.println(value.toLowerCase());
		System.out.println(value.substring(12,17));
		System.out.println(value.substring(3));
		String [] splittedValue = value.split(" ");
		System.out.println(splittedValue[3]);
		System.out.println(splittedValue[7]);
		
		String value1="Bharath";
		String value2="bharath";
		String value3="Bharath";
		String value4 = "hara";
		String value5 = "Hara";
		
		System.out.println(value1.equals(value2));
		System.out.println(value1.equals(value3));
		System.out.println(value1.contains(value4));
		System.out.println(value1.startsWith(value4));
		System.out.println(value1.endsWith(value5));
		
		
		StringBuffer name1 = new StringBuffer("Nilesh");
		name1.append(" Palve");
		System.out.println(name1);

	}

}
