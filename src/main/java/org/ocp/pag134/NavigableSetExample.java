package org.ocp.pag134;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {
	public static void main(String[] args) {
		NavigableSet<Object> set = new TreeSet<>();
		for(int i=0; i<=20;i++) {
			set.add(i);
		}
		
		System.out.println(set.lower(10));
		System.out.println(set.floor(10));
		System.out.println(set.ceiling(20));
		System.out.println(set.higher(20));
	}
}
