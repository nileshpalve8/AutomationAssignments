package com.creatio.crm.langauge.Assignments;

import java.util.ArrayList;
import java.util.List;

public class GroceryList {
	
	List<String> GroceryList = new ArrayList<String>();
	
	public void addItem(String item) {
		GroceryList.add(item);
	}
	
	public void removeItem(String item) {
		GroceryList.remove(item);
	}
	
    public void viewList() {
        System.out.println("Grocery List:");
        for (String item : GroceryList) {
            System.out.println("- " + item);
        }
    }



}
