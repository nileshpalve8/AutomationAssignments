package com.creatio.crm.langauge.Assignments;

public class GroceryTest {

	public static void main(String[] args) {
		GroceryList obj = new GroceryList();
		
		obj.addItem("Apples");
		obj.addItem("Banana");
		obj.addItem("Mango");
		
		
		obj.removeItem("Mango");
		
		obj.viewList();
		
		// System.out.println("Grocery list after adding items:");
		// obj.viewList();

	}

}
