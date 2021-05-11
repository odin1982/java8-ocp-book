package org.ocp.pag133;

import java.util.HashSet;
import java.util.TreeSet;

public class SetCollectionExample {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		boolean b1 = set.add(66);
		boolean b2 = set.add(10);
		boolean b3 = set.add(66);
		boolean b4 = set.add(8);
		
		for(Integer integer: set)
			System.out.println(integer);
		
		//la diferencia es que treeset ordena los elementos
		
		TreeSet<Integer> treeSet = new TreeSet<>();
		boolean c1 = treeSet.add(66);
		boolean c2 = treeSet.add(10);
		boolean c3 = treeSet.add(66);
		boolean c4 = treeSet.add(8);
		
		for(Integer integer: treeSet)
			System.out.println(integer);
	}
}
