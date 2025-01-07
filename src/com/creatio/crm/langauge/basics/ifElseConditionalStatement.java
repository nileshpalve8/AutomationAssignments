package com.creatio.crm.langauge.basics;

public class ifElseConditionalStatement {

	public static void main(String[] args) {
		double percentage = 86.67;
		
		if(percentage>85) {
			System.out.println("You will get IIT");
			if(percentage>90) {
				System.out.println("You will get IT");
			}
			else {
				System.out.println("You will get Mechanical");
			}
		}
		else if(percentage>=80 && percentage<85) {
			System.out.println("You will get NIT");
		}
		else if(percentage>=75 && percentage<80) {
			System.out.println("You will get University");
		}
		else
			System.out.println("You will get Normal coleege");
		

	}

}
