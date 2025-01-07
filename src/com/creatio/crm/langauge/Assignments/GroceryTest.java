package com.creatio.crm.langauge.Assignments;

public class GroceryTest {

	public static void main(String[] args) {
		GroceryList obj = new GroceryList();
		
		obj.addItem("Apples");
		
		 System.out.println("Grocery list after adding items:");
		 obj.viewList();

	}

}
