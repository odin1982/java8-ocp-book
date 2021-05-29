package org.ocp.pag202;

import java.util.stream.Stream;

public class PuttingAllTogether {
	public static void main(String[] args) {
		Stream.generate(() -> "Elsa")
			  .sorted()
			  .limit(2)
			  .forEach(System.out::println);
		
		Stream.generate(() -> "Olaf Lazisson")
			.filter(n -> n.length() == 4)
			.limit(2)
			.sorted()
			.forEach(System.out::println);
		
		
	}

}
