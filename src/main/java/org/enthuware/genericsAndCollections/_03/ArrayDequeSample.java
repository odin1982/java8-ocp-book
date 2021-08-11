package org.enthuware.genericsAndCollections._03;

import java.util.ArrayDeque;
import java.util.Deque;

//ArrayDeque - Se puede comportar como pila o como cola
//push - Agrega un elemento a una pila
//pop - Quita un elemento a una cola
public class ArrayDequeSample {
	public static void main(String[] args) {
		Deque<Integer> d = new ArrayDeque<>();
		d.push(1);
		// [1]
		d.offerLast(2);
		// [1,2]
		d.push(3);
		// [3,1,2]
		d.peekFirst();
		// [3,1,2]
		d.removeLast();
		// [1]
		d.pop();
		// []
		System.out.println(d);
	}

}
