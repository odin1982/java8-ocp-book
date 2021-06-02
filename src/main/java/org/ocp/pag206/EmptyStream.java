package org.ocp.pag206;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class EmptyStream {
	public static void main(String[] args) {
		DoubleStream empty = DoubleStream.empty();
		
		DoubleStream oneValue = DoubleStream.of(3.14);
		DoubleStream varargs = DoubleStream.of(1.0,1.1,1.2);
		oneValue.forEach(System.out::println);
		System.out.println();
		varargs.forEach(System.out::println);
		
		//create infinite streams
		System.out.println();
		DoubleStream random = DoubleStream.generate(Math::random);
		DoubleStream fractions = DoubleStream.iterate(.5, d -> d / 2);
		random.limit(3).forEach(System.out::println);
		
		//use range with IntStream
		System.out.println();
		IntStream range = IntStream.range(1,6);
		range.forEach(System.out::println);
		
		System.out.println();
		IntStream rangeClosed = IntStream.rangeClosed(1, 5);
		rangeClosed.forEach(System.out::println);
	}
}
