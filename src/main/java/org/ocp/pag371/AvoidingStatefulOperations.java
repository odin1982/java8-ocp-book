package org.ocp.pag371;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AvoidingStatefulOperations {
	public static void main(String[] args) {
		List<Integer> data = Collections.synchronizedList( new ArrayList<>() );
		Arrays.asList( 1,2,3,4,5,6 ).parallelStream()
		.map(i -> { data.add(i);return i; })
		.forEachOrdered( i -> System.out.print( i ) );
		
		System.out.println();
		for( Integer e:data ) {
			System.out.print( e + "" );
		}
	}
}
