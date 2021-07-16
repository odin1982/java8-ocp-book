package org.ocp.pag358;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ZooManager2 {
	private Map<String,Object> foodData = new ConcurrentHashMap<String,Object>();
	
	public synchronized void put(String key,String value) {
		foodData.put(key, value);
	}      

	public synchronized Object get(String key) {
		return foodData.get(key);
	}
}
