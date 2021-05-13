package org.ocp.pag137;

import java.util.ArrayDeque;

public class ArrayDequeLikeStackExample {
	public static void main(String[] args) {
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		stack.push(1);System.out.println(stack);
		stack.push(2);System.out.println(stack);
		stack.push(3);System.out.println(stack);
		stack.push(4);System.out.println(stack);
		stack.push(5);System.out.println(stack);
		stack.push(6);System.out.println(stack);
		System.out.print("Retorna siguiente elemento: " + stack.peek() + "    -   ");System.out.println(stack);
		System.out.print("Remeve el siguiente elemento: " + stack.poll() + "    -   ");System.out.println(stack);
		System.out.print("Remeve el siguiente elemento: " + stack.poll() + "    -   ");System.out.println(stack);
	}

}
