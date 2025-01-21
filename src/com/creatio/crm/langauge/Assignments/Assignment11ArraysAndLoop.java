package com.creatio.crm.langauge.Assignments;

public class Assignment11ArraysAndLoop {

	public static void main(String[] args) {
		/*Given values are 12 ,34,11,36,87,98,93.
		Store the values in Array and Print second and third largest number from the above values without
		using collections and default sort methods*/
		
		int [] Values = {12, 34, 11, 36, 87, 98, 93};
		
//		for(int i : Values ) {
//			System.out.println(i);
//		}
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int thirdLargest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		
		for(int i : Values) {
			if(i>largest) {
				thirdLargest = secondLargest;
				secondLargest = largest;
				largest = i;
			}
			else if(i>secondLargest && i != largest ) {
				thirdLargest = secondLargest;
				secondLargest = i;
				
			}
			else if(i>thirdLargest && i != secondLargest && i != largest) {
				thirdLargest = i;
			}
		}
		for(int i : Values) {
			if(i<smallest) {
				smallest = i;
			}
		}
		
		System.out.println("Smallest:" + smallest);
		System.out.println("Second Largest:" + secondLargest);
		System.out.println("Third Largest:" + thirdLargest);
		

	}

}
