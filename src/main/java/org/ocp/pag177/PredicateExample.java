package org.ocp.pag177;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		Predicate<String> p1 = String::isEmpty;
		Predicate<String> p2 = (s) -> s.isEmpty();
		
		System.out.println(p1.test("hOLA"));
		System.out.println(p2.test(""));
		
		BiPredicate<String,String> p3 = (u,v) -> u.startsWith(v);
		BiPredicate<String,String> p4 = String::startsWith;
		
		System.out.println(p3.test("Hola", "H"));
		System.out.println(p4.test("Odin","Od"));
	}
}
