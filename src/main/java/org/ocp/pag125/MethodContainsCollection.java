package org.ocp.pag125;

import java.util.ArrayList;
import java.util.List;

public class MethodContainsCollection {
	public static void main(String[] args) {
		List<String> birds = new ArrayList<>();
		birds.add("hawk");
		System.out.println(birds.contains("hawk"));
		System.out.println(birds.contains("robin"));
	}
}
