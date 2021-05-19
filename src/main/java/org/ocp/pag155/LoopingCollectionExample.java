package org.ocp.pag155;

import java.util.Arrays;
import java.util.List;

public class LoopingCollectionExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Annie","Ripley");
		for(String s: list) {
			System.out.println(s);
		}
		
		list.forEach(s -> System.out.println(s));
		list.forEach(System.out::println);
	}
}
