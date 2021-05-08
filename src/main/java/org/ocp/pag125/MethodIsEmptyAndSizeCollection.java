package org.ocp.pag125;

import java.util.ArrayList;
import java.util.List;

public class MethodIsEmptyAndSizeCollection {
	public static void main(String[] args) {
		List<String> birds = new ArrayList<>();
		birds.add("hawk");
		birds.add("hawk");
		System.out.println(birds.isEmpty());
		System.out.println(birds.size());
	}
}
