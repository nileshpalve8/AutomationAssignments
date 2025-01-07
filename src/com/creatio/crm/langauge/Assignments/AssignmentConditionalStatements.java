package com.creatio.crm.langauge.Assignments;

public class AssignmentConditionalStatements {

	public static void main(String[] args) {
		String customerName = "John Doe";
		int creditScore = 750;
		double income = 55000.0;
		boolean isEmployed = true;
		double debtToIncomeRatio = 35.0;
		
		if(creditScore > 750) {
			System.out.println("The loan is automatically approved");
		}else if(creditScore > 650 && creditScore <= 750) {
			if(income >= 50000 && isEmployed == true && debtToIncomeRatio < 40.0) {
				
			
						System.out.println("Loan Approved");
						System.out.println("Income:" + income);
						System.out.println("IsEmployed:" + isEmployed);
						System.out.println("DebtToIncomeRatio:" + debtToIncomeRatio);
		    }else
		    	System.out.println("Loan Denied ");
					
		}else
			System.out.println("Loan Denied due to low creditScore ");

	}

}
