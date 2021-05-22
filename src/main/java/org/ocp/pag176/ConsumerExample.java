package org.ocp.pag176;

import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = x -> System.out.println(x);
		
		c1.accept("Hola mundo");
		c2.accept("Hola marte");
	}

}
