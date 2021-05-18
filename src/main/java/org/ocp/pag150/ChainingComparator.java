package org.ocp.pag150;

import java.util.Comparator;

import org.ocp.pag149.Squirrel;

public class ChainingComparator implements Comparator<Squirrel>{

	//We sort by species then by we sort by weight
	@Override
	public int compare(Squirrel s1, Squirrel s2) {
		Comparator<Squirrel> c = Comparator.comparing(s -> s.getSpecies());
		c = c.thenComparing(s -> s.getWeight());
		return c.compare(s1, s2);
	}

}
