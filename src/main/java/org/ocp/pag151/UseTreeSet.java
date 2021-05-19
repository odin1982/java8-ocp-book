package org.ocp.pag151;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import org.ocp.pag147.Duck;

public class UseTreeSet {
	static class Rabbit{ int id;}

	public static void main(String[] args) {
		Set<Duck> ducks = new TreeSet<>();
		ducks.add(new Duck("Puddles",20));
		//case 1: throw exception
		Set<Rabbit> rabbits = new TreeSet<>();
		rabbits.add(new Rabbit()); // throws an exception, TreeSet discover Rabbit does not implement Comparable
	
		//case 2: fixing case 1
		Set<Rabbit> rabbits2 = new TreeSet<>(new Comparator<Rabbit>() {

			@Override
			public int compare(Rabbit r1, Rabbit r2) {
				return r1.id - r2.id;
			}
			
		});
		
		rabbits2.add(new Rabbit());
	}
}
