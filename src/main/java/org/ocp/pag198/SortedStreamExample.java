package org.ocp.pag198;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortedStreamExample {
	public static void main(String[] args) {
		Stream<String> s = Stream.of("brown-","bear-");
		s.sorted().forEach(System.out::print);
		
		System.out.println("\n===============\n");
		
		Stream<String> s2 = Stream.of("brown-","bear-");
		s.sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}
