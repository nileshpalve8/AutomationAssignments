package com.creatio.crm.langauge.Assignments;

public class Assignment13 {

	public static void main(String[] args) {
		/*Write a program to perform the following tasks:
			1. Count the total number of words in the sentence.
			2. Print the sentence words in reverse order.
			3. Convert the first character of each word to uppercase and print original sentence*/
		
		String sentence = "Java programming is fun and challenging";
		
		//Count the total number of words in the sentence.
		
		String [] words = sentence.split(" ");
		
		int count = words.length;
		
		System.out.println("Total number of words:" +count);
		
		//Print the sentence words in reverse order.
		
		String reverseOrder = "";
		for(int i = words.length-1; i>=0; i--) {
			reverseOrder += words[i] + " ";
		}
		System.out.println("Sentence words in reverseOrder:" +reverseOrder);
		
		//Convert the first character of each word to uppercase and print original sentence
		
		for(String word:words) {
			System.out.print(word.substring(0, 1).toUpperCase() + word.substring(1, word.length()) + " ");
			
		}
		System.out.println("********assignment**********");
		
		/*Write a program to search for all occurrences of a “Java” word in the paragraph and print their
		indexes.
		1. Divide into multiple words
		2. Find total number of occurrences
		3. Print count and Indexes of the word*/
		
		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";
		
		//
		String [] value1 = paragraph.split(" ");
		int count1 = 0;

		for(String occurance : value1 ) {
			if(occurance.equalsIgnoreCase("Java")) {
				count1++;
			}
			
		}
		System.out.println("Total occurance of a Java word :" +count1);
		
		//Index
		int count2 = 0;
		for(int i=0; i<value1.length; i++) {
			if(value1[i].equalsIgnoreCase("Java")) {
				System.out.println("Index" + i + ":" + value1[i]);
			}
				
		}
		
		
		
		
		
		
		
		//Write a program to print * in triangle pattern
		//1. If I will pass int rows = 5 then it should print triangle with 5 Rows
		int n = 5;
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=n; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}	
			System.out.println();
				
			
			
			
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		

	}

}
