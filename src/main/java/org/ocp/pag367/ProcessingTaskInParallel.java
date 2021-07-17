package org.ocp.pag367;

import java.util.Arrays;

public class ProcessingTaskInParallel {
	public static void main(String[] args) {
		Arrays.asList(1,2,3,4,5,6)
		.stream()
		.forEach(s -> System.out.print(s + " "));
		
		System.out.println("\nParallel Stream with parallel:");
		Arrays.asList(1,2,3,4,5,6)
		.stream()
		.parallel()
		.forEach(s -> System.out.print(s + " "));
		
		System.out.println("\nParallel Stream with parallelStream:");
		Arrays.asList(1,2,3,4,5,6)
		.parallelStream()
		.forEach(s -> System.out.print(s + " "));
		

		System.out.println("\nParallel Stream:");
		Arrays.asList(1,2,3,4,5,6)
		.parallelStream()
		.forEachOrdered(s -> System.out.print(s + " "));

	}

}
