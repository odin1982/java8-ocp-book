package org.ocp.pag206;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingPrimitiveStream {
	public static void main(String[] args) {
		Stream<String> objStream = Stream.of("penguin", "fish");
		IntStream intStream = objStream.mapToInt(s -> s.length());
		intStream.forEach(s -> System.out.println(s));
	}
}
