package com.creatio.crm.langauge.Assignments;

public class Assignment12 {

	public static void main(String[] args) {
		System.out.println("Diamond Pattern");
		
		int n = 5;
		for(int i=1; i<=n; i++) {
			for(int j=i; j<n; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(j+"  ");
			}
			
			System.out.println();
		}

        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
            	System.out.print(j+"  ");
            }
           
            System.out.println();
            
        }

	}

}
