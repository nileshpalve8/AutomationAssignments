package com.creatio.crm.langauge.basics;

import java.util.logging.Logger;

public class HelloWorld {

	public static void main(String[] args) {
		//print the data and end with new line
		System.out.println("Hello World");
		
		//print the data and stay in same line
		System.out.print("hello");
		System.out.print(" World");
		System.out.println();
		
		//print statement to print with specific format
		System.out.printf("My name is %s and my age is %d.%n","Nilesh",25);
		
		//print statements to print explicit format of digits
		System.out.format("pi vale is approx %.2f", 3.14159);
		System.out.println();
		
		//print the character based on ASCII
		System.out.write(65);
		System.out.println("Test");
		
		//print the error messages
		System.err.println("Error while converting ASCII to normal char");
		
		//print the informational message along with time stamp
		Logger.getLogger("MyLogger").info("Error while converting ASCII to normal char");
	

	}

}
