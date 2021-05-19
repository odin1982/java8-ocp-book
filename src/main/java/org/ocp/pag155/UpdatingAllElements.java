package org.ocp.pag155;

import java.util.Arrays;
import java.util.List;

public class UpdatingAllElements {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		list.replaceAll(x -> x*2);
		System.out.println(list);
	}
}
