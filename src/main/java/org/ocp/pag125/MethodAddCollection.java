package org.ocp.pag125;

import java.util.ArrayList;
import java.util.HashSet;

public class MethodAddCollection {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		System.out.println("response: " + list.add("Sparrow"));
		
		HashSet<String> set = new HashSet<>();
		System.out.println("response: " + set.add("odin"));
		System.out.println("response: " + set.add("odin"));
	}
}
