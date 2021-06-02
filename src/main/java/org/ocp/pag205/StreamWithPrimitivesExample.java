package org.ocp.pag205;

import java.util.stream.Stream;

public class StreamWithPrimitivesExample {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1,2,3);
		System.out.println(stream.reduce(0,(s,n)->s+n));
	}
}
