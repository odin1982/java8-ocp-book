package org.enthuware.genericsAndCollections._02;

import java.util.ArrayDeque;
import java.util.Deque;

//queue = cola
public class ArrayDequeSample {
	public static void main(String[] args) {
		Deque<Integer> d = new ArrayDeque<>();
		d.add(1);
		d.addFirst(2);
		d.pop();
		d.offerFirst(3);
		System.out.println(d);
	}
}
