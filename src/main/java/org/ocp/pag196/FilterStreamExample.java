package org.ocp.pag196;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterStreamExample {
	public static void main(String[] args) {
		Stream<String> s = Stream.of("monkey","gorilla","bonobo","mono");
		s.filter(x -> x.startsWith("m")).forEach(System.out::println);
		
		//Si quieres guardarlos en una lista
		Stream<String> animales = Stream.of("monkey","gorilla","bonobo","mono");
		List<String> startWithMList = animales.filter(x -> x.startsWith("m")).collect(Collectors.toList());
		System.out.println(startWithMList);
	}
}
