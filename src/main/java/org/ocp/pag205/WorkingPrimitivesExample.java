package org.ocp.pag205;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WorkingPrimitivesExample {
	public static void main(String[] args) {
		System.out.println("reduce: ");
		Stream<Integer> stream = Stream.of(1,2,3);
		System.out.println(stream.reduce(0,(s,n) -> s+n));
		
		System.out.println("using sum: ");
		Stream<Integer> stream2 = Stream.of(1,2,3);
		System.out.println(stream2.mapToInt(x -> x).sum());
		
		System.out.println("average: ");
		IntStream intStream = IntStream.of(1,2,3);
		OptionalDouble avg = intStream.average();
		System.out.println(avg.getAsDouble());
		
	}
}
