package org.enthuware.advancedClassDesign._15;

import java.util.TreeSet;

enum SIZE{
	TALL,JUMBO,GRANDE;
}

public class CofeeMug {
	public static void main(String[] args) {
		TreeSet<SIZE> hs = new TreeSet<SIZE>();
		hs.add(SIZE.TALL);
		hs.add(SIZE.JUMBO);
		hs.add(SIZE.GRANDE);
		hs.add(SIZE.TALL);
		hs.add(SIZE.JUMBO);
		
		for(SIZE s:hs) {
			System.out.println(s);
		}
	}
}
