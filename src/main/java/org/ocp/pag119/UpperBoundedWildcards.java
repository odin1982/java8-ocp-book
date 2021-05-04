package org.ocp.pag119;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundedWildcards {
	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<Integer>();// DOES NOT COMPILE
		// Instead we need to use a wild card
		
		ArrayList<? extends Number> l = new ArrayList<Integer>();
	}
	
	public static long total(List<? extends Number> list) {
		long count = 0;
		for(Number number:list)
			count += number.longValue();
		return count;
	}
	
	//equivalent version Java8 before
	public static long totalErasureType(List list) {
			long count = 0;
			for(Object obj:list) {
				Number number =(Number)obj;
				count += number.longValue();
			}
			return count;
	}
	
}
