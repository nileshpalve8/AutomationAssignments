package com.creatio.crm.langauge.Assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment8t {

	public static void main(String[] args) {
		String [] names = {"Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green"};
		double [] baseSalaries = {75000.0, 68000.0, 82000.0, 90000.0, 60000.0};
		double [] exps = {5.0, 3.0, 7.0, 10.0, 2.0};
		double [] ratings = {4.2, 3.8, 4.5, 2.0, 3.5};
		
		Map<String, Double> empHikePercentage = new HashMap();
		
		for(int i=0; i < names.length; i++) {
			String name = names[i];
			double baseSalary = baseSalaries[i];
			double exp = exps[i];
			double rating = ratings[i];
			
			int variablePay;
			int bonus;
			int reward = 0;
			
			if(rating>=4) {
				variablePay=15;
				bonus=1500;
			}
			else if(rating>=3 && rating< 4) {
				variablePay=10;
				bonus=1200;
			}
			else if(rating < 3){
				variablePay=3;
				bonus=300;
			}
			else {
				variablePay=0;
				bonus=0;
			}
			
			
			if(exp>= 5) {
				reward=5000;
			}
			else {
				reward=0;
			}
			
			//Hike calculations
			
			double hike;
			double hikePercentage;
			hike = ( baseSalary * variablePay/100 ) + bonus + reward;
			hikePercentage = (hike/baseSalary)*100;
			
			empHikePercentage.put(name, hikePercentage);
		
			
		}
        for (Map.Entry<String, Double> entry : empHikePercentage.entrySet()) {
            System.out.println(entry.getKey()+":"+ entry.getValue() +"%");
        }

	}

}
