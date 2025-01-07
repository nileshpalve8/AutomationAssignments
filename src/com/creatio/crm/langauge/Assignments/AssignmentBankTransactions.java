package com.creatio.crm.langauge.Assignments;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AssignmentBankTransactions {

	public static void main(String[] args) {
		
		ArrayList<Integer> BankTransactions = new ArrayList<Integer>();
		
		BankTransactions.add(50000);
		BankTransactions.add(-2000);
		BankTransactions.add(3000);
		BankTransactions.add(-15000);
		BankTransactions.add(-200);
		BankTransactions.add(-300);
		BankTransactions.add(4000);
		BankTransactions.add(3000);
		
		System.out.println(BankTransactions);
		
		
		//1. Print total number of credit and debit transactions completed
		
        int creditcount = 0;
        int debitcount = 0;
        
        for(int i : BankTransactions ) {
        	if(i>0) {
        		creditcount++;
        		
        	}else
        		debitcount++;
        }
        System.out.println("Toatal credit Transaction:" + creditcount);
        System.out.println("Toatal debit Transaction:" + debitcount);
        
        //2.Print the total amount credited and debited in account
        for(int i : BankTransactions ) {
        	if(i>0) {
        		creditcount = i+creditcount;
        		
        	}else
        		debitcount = i+debitcount;
        }
        System.out.println("Toatal credit Amount:" + creditcount);
        System.out.println("Toatal debit Amount:" + debitcount);
        
        
        //3.Print total amount remaining at the end in Bank Account
        int remaining_amount = creditcount + debitcount;
        System.out.println("Toatal Remaining Amount:" + remaining_amount);
        
        
        /*4.If any transaction limit exceeds +/- 10000 then print the message “Suspicious credit/ debit
        Transaction with Amount” and also print total number of suspicious transactions*/
        
        int suspicious_transaction = 0;
        for(int i : BankTransactions) {
        	if(i>10000 || i<(-10000)) {
        		suspicious_transaction++;
        	
        	}
        	System.out.println("Suspicious credit/ debit Transaction with Amount:" +  i);
        	System.out.println("Number of Suspicious Transaction:" +  suspicious_transaction);
        }
      
	}

}

