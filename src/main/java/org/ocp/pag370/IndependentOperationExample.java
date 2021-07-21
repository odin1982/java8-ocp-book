package org.ocp.pag370;

import java.util.Arrays;

public class IndependentOperationExample {
	public static void main(String[] args) {
		Arrays.asList("jackal","kangaroo","lemur")
		.parallelStream()
		.map(s -> s.toUpperCase())
		.forEach(System.out::println);
		
		System.out.println("\n");
		
		Arrays.asList("jackal","kangaroo","lemur")
		.parallelStream()
		.map(s -> {System.out.println(s);return s.toUpperCase();})
		.forEach(System.out::println);
		
	}
}
