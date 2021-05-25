package org.ocp.pag182;

import java.util.Optional;

public class OptionalExample {
	public static void main(String[] args) {
		System.out.println(average(90,100));
		System.out.println(average());
		
		Optional<Double> opt = average(90,100);
		if(opt.isPresent())
			System.out.println(opt);
		
		Optional<Double> opt2 = average();
		if(opt2.isPresent())
			System.out.println(opt2);
		
		// Optional o = (value == null) ? Optional.empty() : Optional.of(value);
		// =
		// Optional o = Optional.ofNullable(value);
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
