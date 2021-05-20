package org.ocp.pag156;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MergeExample {
	public static void main(String[] args) {
		BiFunction<String,String,String> mapper = (v1,v2) -> v1.length() > v2.length() ? v1:v2;
		
		Map<String,String> favorites = new HashMap<>();
		favorites.put("Jenny", "Bus Tour");
		favorites.put("Tom","Tram");
		
		String jenny = favorites.merge("Jenny", "Skyride", mapper);
		String tom = favorites.merge("Tom","Skyride", mapper);
		
		System.out.println(favorites);
		System.out.println(jenny);
		System.out.println(tom);
		
		
		Map<String, String> favs = new HashMap<>();
		favs.put("Sam", null);
		favs.merge("Tom", "Skyride", mapper);
		favs.merge("Sam", "Skyride", mapper);
		System.out.println("favs: " + favs);
		
		
		
		BiFunction<String,String,String> mapper2 = (v1,v2) -> null;
		Map<String, String> favs2 = new HashMap<>();
		favs2.merge("Jenny", "Bus Tour", mapper2);
		favs2.merge("Tom", "Bus Tour", mapper2);
		System.out.println("favs2:" + favs2);
		
	}
}
