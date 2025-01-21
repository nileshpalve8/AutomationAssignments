package com.streams.Api.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterCollection {

	public static void main(String[] args) {
		List<Integer> inputList = List.of(1,2,3,4,5,6,7,8,9,10);
//		System.out.println(inputList);
//		
//		List<Integer> outputList = new ArrayList<Integer>();
//		for(int value:inputList) {
//			if(value % 2 != 0) {
//				outputList.add(value);
//			}
//		}
//		System.out.println(outputList);
	
	List<Integer> outputList = inputList.stream().filter(i -> i %2 != 0).collect(Collectors.toList());
	System.out.println(outputList);
	
//	List<Integer> outputSquareList = new ArrayList<Integer>();
//	for(int val:inputList) {
//		outputSquareList.add(val*val);
//	}
//	System.out.println(outputSquareList);
	
	List<Integer> outputSquareList = inputList.stream().map(val -> val*val).collect(Collectors.toList());
	System.out.println(outputSquareList);
	

	}

}
