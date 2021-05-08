package org.ocp.pag125;

import java.util.ArrayList;
import java.util.List;

public class MethodRemoveCollection {
	public static void main(String[] args) {
		List<String> birds = new ArrayList<>();
		birds.add("hawk");
		birds.add("hawk");
		System.out.println(birds.remove("cardinal"));
		System.out.println(birds.remove("hawk"));
		System.out.println(birds);
	}
}
