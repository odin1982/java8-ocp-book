package org.ocp.pag367;

import java.util.Arrays;
import java.util.stream.Stream;

public class ParallelStreamExample {
	public static void main(String[] args) {
		Stream<Integer> stream = Arrays.asList(1,2,3,4,5,6).stream();
		Stream<Integer> parallelStream = stream.parallel();
		
		Stream<Integer> parallelStream2 = Arrays.asList(1,2,3,4,5,6).parallelStream();
	}
}
