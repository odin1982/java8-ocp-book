package org.ocp.pag152;

import java.util.Comparator;

import org.ocp.pag146.Duck;

public class DuckHelper {
	public static int compareByWeight(Duck d1, Duck d2) {
		return d1.getWeight() - d2.getWeight();
	}
	
	public static int compareByName(Duck d1, Duck d2) {
		return d1.getName().compareTo(d2.getName());
	}
	
	public static void main(String[] args) {
		Comparator<Duck> byWeight = (d1,d2) -> DuckHelper.compareByWeight(d1, d2);
		//or
		Comparator<Duck> byWeight2 = DuckHelper::compareByWeight;
	}

}
