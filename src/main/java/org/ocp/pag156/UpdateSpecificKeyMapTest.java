package org.ocp.pag156;

import java.util.HashMap;
import java.util.Map;

public class UpdateSpecificKeyMapTest {
	public static void main(String[] args) {
		Map<String, String> favorites = new HashMap<>();
		favorites.put("Jenny","Bus Tour");
		favorites.put("Jenny","Tram");
		System.out.println("favorites: " + favorites);
		
		//with putIfAbsent
		// only if there isn't key or it it has a null value put into the Map
		
		HashMap<String, String> fav = new HashMap<>();
		fav.put("Jenny", "Bus Tour");
		fav.put("Tom",null);
		
		fav.putIfAbsent("Jenny", "Tram");
		fav.putIfAbsent("Sam", "Tram");
		fav.putIfAbsent("Tom", "Tram");
		System.out.println("fav: "+ fav);
	}
}
