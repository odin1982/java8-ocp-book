package org.ocp.pag182;

import java.util.Optional;

public class OptionalMethodsExample {
	public static void main(String[] args) {
		Optional<Double> opt = average(90,100);
		
		//ifPresent(Consumer)
		//Consumer = in:1parametro, out:void 
		opt.ifPresent(System.out::println);
		
		Optional<Double> opt2 = average();
		System.out.println(opt2.orElse(Double.NaN));
		
		//orElseGet(Supplier)
		//Supplier = in:0 parameters,out:return parameter
		System.out.println(opt2.orElseGet(() -> Math.random()));
		
		
		//orElseThrow(Supplier)
		System.out.println(opt2.orElseThrow(()-> new IllegalStateException()));
		
		//System.out.println(opt.orElseGet(()-> new IllegalStateException()));// DOES NOT COMPILE because supplier must return a Double
		
		Optional<Double> opt3 = average(90,100);
		System.out.println( opt3.orElse(Double.NaN) );
		System.out.println( opt3.orElseGet(()-> Math.random()) );
		System.out.println( opt3.orElseThrow(()-> new IllegalStateException()) );
	}
	
	public static Optional<Double> average(int... scores){
		if(scores.length == 0) {
			return Optional.empty();
		}
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		return Optional.of((double) sum / scores.length);
	}
}
