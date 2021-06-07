package org.ocp.pag218;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingUsingBasicCollectors {
	public static void main(String[] args) {
		Stream<String> ohMy = Stream.of("lions","tigers","bears");
		String result = ohMy.collect(Collectors.joining(", "));
		System.out.println(result);
		
		Stream<String> ohMy2 = Stream.of("lions","tigers","bears");
		double result2 = ohMy2.collect(Collectors.averagingInt(String::length));
		System.out.println(result2);
		
		Stream<String> ohMy3 = Stream.of("lions","tigers","bears");
		TreeSet<String> result3 =  ohMy3.filter(s -> s.startsWith("t")).collect(Collectors.toCollection(TreeSet::new));
		System.out.println(result3);
	}
}
