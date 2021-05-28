package org.ocp.pag198;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapStreamExample {
	public static void main(String[] args) {
		List<String> zero = Arrays.asList();
		List<String> one = Arrays.asList("Bonobo");
		List<String> two = Arrays.asList("Mama Gorilla","Baby Gorilla");
		Stream<List<String>> animals = Stream.of(zero,one,two);
		
		// As you can see, it removed the empty list completely and changed all elements 
		// of each list to be at the top level of the stream
		animals.flatMap(l -> l.stream()).forEach(System.out::println);
	}
}
