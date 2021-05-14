package org.ocp.pag143;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Duck implements Comparable<Duck>{
	private String name;
	
	public Duck(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Duck o) {
		return name.compareTo(o.name);//Esta haciendo la comparacion por nombre
	}
	
	public static void main(String[] args) {
		List<Duck> ducks = new ArrayList<>();
		ducks.add(new Duck("Quack"));
		ducks.add(new Duck("Puddles"));
		Collections.sort(ducks);
		System.out.println(ducks);
	}

}
