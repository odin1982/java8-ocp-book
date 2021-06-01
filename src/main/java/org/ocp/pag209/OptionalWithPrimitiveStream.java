package org.ocp.pag209;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class OptionalWithPrimitiveStream {
	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(1, 10);
		OptionalDouble optional = stream.average();
		if(optional.isPresent()) {
			System.out.println(optional.getAsDouble());
		}
		
		optional.ifPresent(System.out::println);
		
		LongStream longs = LongStream.of(5,10);
		long sum = longs.sum();
		System.out.println(sum);
		
		DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
		OptionalDouble min = doubles.min();
	}
}
