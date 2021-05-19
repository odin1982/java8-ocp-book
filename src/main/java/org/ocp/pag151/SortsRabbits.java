package org.ocp.pag151;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortsRabbits {
	static class Rabbit{ 
		int id;
		
		public Rabbit(int id) {
			this.id = id;
		}

		@Override
		public String toString() { return "Rabbit [id=" + id + "]"; }
		
	}
	public static void main(String[] args) {
		List<Rabbit> rabbits = new ArrayList<>();
		rabbits.add(new Rabbit(10));
		rabbits.add(new Rabbit(7));
		rabbits.add(new Rabbit(5));
		Comparator<Rabbit> c = (r1,r2) -> r1.id - r2.id;
		Collections.sort(rabbits,c);
		System.out.println(rabbits);
	}
}
