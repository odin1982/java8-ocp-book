package org.ocp.pag151;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Fluffy","Hoppy");
		Comparator<String> c = Comparator.reverseOrder();
		int index = Collections.binarySearch(names, "Hopppy", c);
		System.out.println(index);
	}

}
