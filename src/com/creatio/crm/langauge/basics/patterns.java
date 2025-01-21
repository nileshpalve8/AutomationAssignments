package com.creatio.crm.langauge.basics;

public class patterns {

	public static void main(String[] args) {
		
		//for square
		int n=5;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		//for increasing triangle
		System.out.println("increasing triangle");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//for Decreasing triangle
		System.out.println("Decreasing triangle");
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//for Right sided  triangle
		System.out.println("Right sided  triangle");
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=n; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//for Right sided  triangle
		System.out.println("Right sided  triangle 1");
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("  ");
			}
			for(int j=i; j<=n; j++) {
				System.out.print("* ");
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
				System.out.print("* ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//opposite Hill Pattern
		System.out.println("opposite Hill Pattern");
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("  ");
			}
			for(int j=i; j<n; j++) {
				System.out.print("* ");
			}
			for(int j=i; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//Diamond Pattern
		System.out.println("Diamond Pattern");
		for(int i=1; i<n; i++) {
			for(int j=i; j<=n; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<i; j++) {
				System.out.print("* ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("  ");
			}
			for(int j=i; j<n; j++) {
				System.out.print("* ");
			}
			for(int j=i; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//with number
		//for increasing triangle
		System.out.println("increasing triangle");
		for(int i=1, p=1; i<=n; i++, p++) {
			for(int j=1; j<=i; j++) {
				System.out.print(p+ " ");
			}
			System.out.println();
		}
		
		//for decreasing triangle
		System.out.println("decreasing triangle");
		for(int i=1, p=5; i<=n; i++, p--) {
			for(int j=1; j<=i; j++) {
				System.out.print(p+ " ");
			}
			System.out.println();
		}
		//for decreasing triangle
		System.out.println("decreasing triangle");
		for(int i=1, p=0; i<=n; i++, p+=2) {
			for(int j=1; j<=i; j++) {
				System.out.print(p+ " ");
			}
			System.out.println();
		}
		
		//Diamond Pattern with no.
		System.out.println("Diamond Pattern");
		 for (int i = 1; i <= n; i++) {
	            // Print spaces
	            for (int j = i; j <= n; j++) {
	                System.out.print(" ");
	            }
	            // Print increasing numbers
	            for (int j = 1; j < i; j++) {
	                System.out.print(j + "  ");
	            }
	            // Print the last number
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j + "  ");
	            }
	            System.out.println();
	        }

	        // Bottom half of the diamond
	        for (int i = 1; i < n; i++) {
	            // Print spaces
	            for (int j = 1; j <= i + 1; j++) {
	                System.out.print(" ");
	            }
	            // Print increasing numbers
	            for (int j = 1; j < n - i; j++) {
	                System.out.print(j + " ");
	            }
	            // Print the last number
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }
	        
	        for(int i=1, p=1; i<=n; i++, p++ ) {
	        	for(int j=1; j<=i; j++) {
	        		System.out.print(p+ " ");
	        	}
	        	System.out.println();
	        }
	        
	        for(int i=1, p=5; i<=n; i++, p--) {
	        	for(int j=1; j<=i; j++) {
	        		System.out.print(p+ " ");
	        	}
	        	System.out.println();
	        }
	        System.out.println("************");
	        
	        for(int i = 1, p=1; i <= n; i++, p++) {
	        	for(int j = i; j < n; j++) {
	        		System.out.print("  ");
	        	}
	        	for(int j = 1; j <= i; j++) {
	        		System.out.print(p + " ");
	        	}
	        	System.out.println();
	        }
	        for (int i = 1; i <= n; i++) {
	            // Print spaces
	            for (int j = i; j < n; j++) {
	                System.out.print("  ");
	            }
	            // Print repeated numbers
	            for (int j = 1; j <= i; j++) {
	                System.out.print(i + " ");
	            }
	            System.out.println();
	        }

		
		

	}

}
