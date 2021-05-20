package org.ocp.pag157;

import java.util.HashMap;
import java.util.Map;

public class ComputeIfAbsentAndPresentCaseNull {
	public static void main(String[] args) {
		Map<String,Integer> counts = new HashMap<>();
		counts.put("Jenny", 1);
		
		counts.computeIfPresent("Jenny", (k,v) -> null);
		counts.computeIfAbsent("Sam", k -> null);
		System.out.println(counts);
	}
}
