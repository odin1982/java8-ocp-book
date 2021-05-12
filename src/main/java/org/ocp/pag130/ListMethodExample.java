package org.ocp.pag130;

import java.util.ArrayList;
import java.util.List;

public class ListMethodExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("SD");
		System.out.println(list);
		list.add(0,"NY");
		System.out.println(list);
		list.add(1,"FL");
		System.out.println(list);
		list.remove("NY");
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.add("OH");
		System.out.println(list);
		list.add("CO");
		System.out.println(list);
		list.add("NJ");
		System.out.println(list);
		String state = list.get(0);
		System.out.println(state);
		int index = list.indexOf("NJ");
		System.out.println(index);
	}
}
