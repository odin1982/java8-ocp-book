package org.ocp.pag190;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class CommonTerminalOperation {
	public static void main(String[] args) {
		// count
		Stream<String> s = Stream.of("monkey","gorilla","bonobo");
		System.out.println("count: " + s.count());
		
		
		// min
		Stream<String> sDos = Stream.of("monkey","ape","bonobo");
		Optional<String> min = sDos.min((s1,s2) -> s1.length() - s2.length());
		min.ifPresent(System.out::println);
		
		Stream<Integer> sTres = Stream.of(11,22,13,40,51,20);
		Optional<Integer> minimo = sTres.min((a,b) -> a - b );
		minimo.ifPresent(System.out::println);
		
		Stream<String> equipos = Stream.of("america","chivas","pachuca","tigres");
		Stream<String> infinite = Stream.generate(() -> "pachuca");
		equipos.findAny().ifPresent(System.out::println);
		infinite.findAny().ifPresent(System.out::println);
		
		List<String> list = Arrays.asList("monkey","2","chimp");
		Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
		System.out.println("anyMatch: " + list.stream().anyMatch(pred));
		System.out.println("allMatch: " + list.stream().allMatch(pred));
		System.out.println("noneMatch: " + list.stream().noneMatch(pred));
		
		Stream<String> animales = Stream.of("Monkey","Gorilla","Bonobo");
		animales.forEach(System.out::println);
		
		Stream<String> stream = Stream.of("w","o","l","f");
		String word = stream.reduce("", (m,n) -> m + n);
		System.out.println(word);
		
		Stream<Integer> numeros = Stream.of(3,5,6);
		System.out.println("numeros multiplicados: " + numeros.reduce(1, (a,b) -> a*b));
		
		List<String> vowels = Arrays.asList("a", "e", "i", "o", "u");

		// sequential stream - nothing to combine
		StringBuilder result = vowels.stream().collect(StringBuilder::new, (x, y) -> x.append(y),
				(a, b) -> a.append(",").append(b));
		System.out.println(result.toString());

		// parallel stream - combiner is combining partial results
		StringBuilder result1 = vowels.parallelStream().collect(StringBuilder::new, (x, y) -> x.append(y),
				(a, b) -> a.append(",").append(b));
		System.out.println(result1.toString());

		
	}
}
