package org.ocp.pag177;

import java.util.function.Predicate;

public class ManyPredicatesExamples {
	public static void main(String[] args) {
		Predicate<String> egg = s -> s.contains("egg");
		Predicate<String> brown = s -> s.contains("brown");
		
		//Hard to read
		//Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");
		//Predicate<String> otherEggs = s -> s.contains("egg") && !s.contains("brown");
		
		//Easy to read
		Predicate<String> brownEggs = egg.and(brown);
		Predicate<String> otherEggs = egg.and(brown.negate());
		
		System.out.println(brownEggs.test("egg brown"));
		System.out.println(brown.test("egg blue"));
		System.out.println(otherEggs.test("egg blue"));
	}

}
