package org.ocp.pag197;

import java.util.stream.Stream;

public class MapStreamExample {
	public static void main(String[] args) {
		Stream<String> s = Stream.of("monkey","gorilla","bonobo");
		s.map(String::length).forEach(System.out::print);
	}
}
