package org.ocp.pag139;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("koala", "bamboo");
		map.put("lion", "meat");
		map.put("giraffe", "leaf");
		String food = map.get("koala");System.out.println("food: " + food);
		
		for(String key: map.keySet()) {
			System.out.println("key: " + key );
		}
	}
}
