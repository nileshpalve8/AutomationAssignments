package com.creatio.crm.langauge.Assignments;

public class Assignment15 {

	public static void main(String[] args) {
		/*
		 * 1. String input = " I Love Dogs "; Print All 2 Letter word combinations from
		 * this and 2 chars should not have same letter
		 */

		String Input = " I Love Dogs ";

		Input = Input.replaceAll(" ", "");
		Input = Input.toUpperCase();
		System.out.println("All 2-letter combinations:");
		

        for (int i = 0; i < Input.length(); i++) {
            for (int j = 0; j < Input.length(); j++) {
                if (i != j) { // Ensure characters are not repeated
                    System.out.println("" + Input.charAt(i) + Input.charAt(j));
				}

			}
		}
        
        /*2. A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all
        non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include
        letters and numbers.
        Given a string s, return true if it is a palindrome, or false otherwise.

        Example 1:
        Input: s = "A man, a plan, a canal: Panama"
        Output: true
        Explanation: "amanaplanacanalpanama" is a palindrome.*/

        
        String s = "A man, a plan, a canal: Panama";
        s = s.replaceAll("[^a-zA-Z]", "");

        s = s.toLowerCase();
        System.out.println(s);
        
		String reverseValue = "";
		for(int i=s.length()-1; i>=0; i--) {
			reverseValue+=s.charAt(i);

		}
		if(s.equals(reverseValue)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
        /*Example 2:
        Input: s = "race a car"
        Output: false
        Explanation: "raceacar" is not a palindrome.*/
		
        String car = "race a car";
        car = car.replaceAll("[^a-zA-Z]", "");

        car = car.toLowerCase();
        System.out.println(s);
        
		String reverseValue1 = "";
		for(int i=car.length()-1; i>=0; i--) {
			reverseValue1+=car.charAt(i);

		}
		if(s.equals(reverseValue1)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}


	}

}
