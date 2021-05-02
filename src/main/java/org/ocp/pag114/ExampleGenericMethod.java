package org.ocp.pag114;

import org.ocp.pag109.Crate;

public class ExampleGenericMethod {
	public static <T> Crate<T> ship(T t){
		System.out.println("Preparing "+ t);
		return new Crate<T>();
	}
	
	public static <T> void sink(T t) {
		
	}
	
	public static <T> T identity(T t) {
		return t;
	}
	
	public static  T noGood(T t) { // DOES NOT COMPILE
		return t;
	}
}
