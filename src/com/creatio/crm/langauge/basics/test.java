package com.creatio.crm.langauge.basics;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
//        int button = 4;
//        
//        
//        switch(button) {
//        case 1: System.out.println("Hello");
//        break;
//        case 2: System.out.println("Namaste");
//        break;
//        case 3: System.out.println("Hello");
//        break;
//        default: System.out.print("Invalid buton");
//        }
//        
//        int n = 2;
//        for(int i = 1; i<11; i++) {
//        	System.out.println(i*n);
//        }
        
//		Scanner sc = new Scanner(System.in);
//		 System.out.print("Enter a number (n): ");
//		int n = sc.nextInt();
//		for(int i = 2; i<=n; i+=2) {
//			System.out.println(i);
//		}
//		sc.close();
		
		int n = 5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
			System.out.print(i+" ");
			}
		System.out.println();
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=n; j++) {
			System.out.print(i+" ");
			}
		System.out.println();
		}
		
		System.out.println("test");
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("  ");
			}
			for(int j=i; j<=n; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("-------test--------");
		for(int i=1; i<n; i++) {
			for(int j=i; j<=n; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<i; j++) {
				System.out.print(i+" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("  ");
			}
			for(int j=i; j<=n; j++) {
				System.out.print(i+" ");
			}
			for(int j=i; j<n; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("*****diamond******");
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=n; j++) {
				System.out.print("  ");
			}
			for(int j=i; j<=n; j++) {
				System.out.print("  ");
			}
			System.out.println();
		}
		//for Hill Pattern
		System.out.println("Hill Pattern");
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=n; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<i; j++) {
				System.out.print(j+" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//Diamond Pattern
				System.out.println("Diamond Pattern");
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