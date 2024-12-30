package com.creatio.crm.langauge.basics;

import java.util.Hashtable;
import java.util.Map;

public class Collection {

	public static void main(String[] args) {
		//System.out.println("*************** Hashtable ***************");
		Map<Integer,String > empNamesHashtable = new Hashtable<Integer, String>();
		empNamesHashtable.put(1,"Amit");
		empNamesHashtable.put(2,"Anurag");
		empNamesHashtable.put(2,"Devi");
		empNamesHashtable.put(3,"Amit");
		empNamesHashtable.put(4,"Bharath");
//		empNamesHashtable.put(5,null);
//		empNamesHashtable.put(null,"Aasha");
		empNamesHashtable.remove(4);
		System.out.println("Total Values in Hashtable are :"+empNamesHashtable.size());
		System.out.println(empNamesHashtable);	

	}

}
