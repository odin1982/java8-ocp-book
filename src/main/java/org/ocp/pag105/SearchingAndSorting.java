package org.ocp.pag105;

import java.util.Arrays;

public class SearchingAndSorting {
	public static void main(String[] args) {
		int[] numbers = {6,9,1,7};
		Arrays.sort(numbers);
		System.out.println(Arrays.binarySearch(numbers, 3));
	}
}
