package com.creatio.crm.langauge.Assignments;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Assignment5ArraysAndCollections {

	public static void main(String[] args) {
		// 1. Create a list of the top 5 most populated countries in the world and print 2nd Country
		List<String> countries = new ArrayList<String>();
		countries.add("India");
		countries.add("China");
		countries.add("United States");
		countries.add("Indonesia");
		countries.add("Pakistan");
		
		System.out.println("2nd most populated country:" + countries.get(1));
		
		//2. Create a set of the top 10 most visited tourist attractions in the world and print out its size.
		Set<String> TouristSpot = new LinkedHashSet<String>();
		TouristSpot.add("Empire State Building, New York City, United States");
		TouristSpot.add("Eiffel Tower, Paris, France");
		TouristSpot.add("Anne Frank House, Amsterdam, The Netherlands");
		TouristSpot.add("Basílica de la Sagrada Familia, Barcelona, Spain");
		TouristSpot.add("Cayman Crystal Caves, Grand Cayman, Caribbean");
		TouristSpot.add("Colosseum, Rome, Italy");
		TouristSpot.add("Louvre Museum, Paris, France");
		TouristSpot.add("Gardens by the Bay, Singapore");
		TouristSpot.add("Duomo di Milano, Milan, Italy");
		TouristSpot.add("Sheikh Zayed Grand Mosque Centre, Abu Dhabi, United Arab Emirates");
		
		System.out.println("Total Value of TouristSpot:" + TouristSpot.size());
		System.out.println(TouristSpot);
		
		//3. Create a map of the 5 largest cities in the United States and their populations.
		Map<String, String> cities = new LinkedHashMap<String, String>();
		cities.put("New York City", "8,335,897");
		cities.put("Los Angeles", "3,822,238");
		cities.put("Chicago", "2,665,039");
		cities.put("Houston", "2,302,878");
		cities.put(" Phoenix", "1,644,409");
		System.out.println(cities);
		
		// OR
		
		Map<String, Integer> cities1 = new LinkedHashMap<String, Integer>();
		cities1.put("New York City", 8335897);
		cities1.put("Los Angeles", 3822238);
		cities1.put("Chicago", 2665039);
		cities1.put("Houston", 2302878);
		cities1.put(" Phoenix", 1644409);
		System.out.println(cities1);
		
		//4. Create an array of 10 random integers and print out the sum of 3rd and 5th Value.
		
		int[] Random = new int[10];
		
		Random[0] = 10;
		Random[1] = 20;
		Random[2] = 30;
		Random[3] = 40;
		Random[4] = 50;
		Random[5] = 60;
		Random[6] = 70;
		Random[7] = 80;
		Random[8] = 90;
		Random[9] = 100;
		
		System.out.println(Random[2]+Random[4]);
		
		
		
		//5. Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
		List<String> movie = new ArrayList<String>();
		movie.add("Avatar");
		movie.add("Avengers: Endgame");
		movie.add("Avatar: The Way of Water");
		movie.add("Titanic");
		movie.add("Star Wars: Episode VII - The Force Awakens");
		
		System.out.println(movie.get(2));

	}

}
