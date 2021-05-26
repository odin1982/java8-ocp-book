package org.ocp.pag188;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		Stream<String> empty = Stream.empty();
		Stream<Integer> singleElement = Stream.of(1);
		Stream<Integer> fromArray = Stream.of(1,2,3);//use varargs
		
		List<String> list = Arrays.asList("a","b","c");
		Stream<String> fromList = list.stream();
		Stream<String> fromListParallel = list.parallelStream();//process element in parallel
	}
}
