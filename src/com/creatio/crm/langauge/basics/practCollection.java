package com.creatio.crm.langauge.basics;

import java.util.ArrayList;

public class practCollection {

	public static void main(String[] args) {
		ArrayList<Integer> List = new ArrayList<Integer>();
		//for adding number in List
		List.add(1);
		List.add(2);
		List.add(3);
		List.add(4);
		List.add(5);
		List.add(null);
		
		System.out.println(List);
		//To get element
		int val=List.get(3);
		System.out.println(val);
		System.out.println(List);
		//To remove element
		List.remove(2);
		System.out.println(List);
		
		//to get size
		System.out.println(List.size());
		
		//to set element
		List.set(0, 9);
		System.out.println(List);

	}

}
