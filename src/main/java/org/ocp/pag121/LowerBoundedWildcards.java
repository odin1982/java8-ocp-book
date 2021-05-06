package org.ocp.pag121;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcards {
	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();
		strings.add("tweet");
		List<Object> objects = new ArrayList<Object>(strings);
		addSound(strings);
		addSound(objects);
	}
	
	
	public static void addSound(List<?> list) {
		list.add("quack");// DOES NOT COMPILE, unbounded wildcard is immutable
	}
	
	
	
	public static void addSound(List<? extends Object> list) {
		list.add("quack");//DOES NOT COMPILE, upper bounded generics are immutable
	}
	
	//addSound(strings) //DOES NOT COMPILE, because with generics must pass the exact match
	public static void addSound(List<Object> list) {
		list.add("quack");
	}
	
	
	public static void addSound(List<? super String> list) {
		list.add("quack");
	}
}
