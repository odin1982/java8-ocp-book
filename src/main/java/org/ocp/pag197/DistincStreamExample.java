package org.ocp.pag197;

import java.util.stream.Stream;

public class DistincStreamExample {
	public static void main(String[] args) {
		Stream<String> s = Stream.of("duck","duck","duck","goose");
		s.distinct().forEach(System.out::println);
	}
}
