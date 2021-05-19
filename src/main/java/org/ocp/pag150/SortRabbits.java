package org.ocp.pag150;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.ocp.pag146.Duck;

public class SortRabbits {
	static class Rabbit{int id;}
	
	public static void main(String[] args) {
		List<Rabbit> rabbits = new ArrayList<>();
		rabbits.add(new Rabbit());
		Collections.sort(rabbits); //DOES NOT COMPILE RABBIT IS NOT COMPARABLE
	}
}
