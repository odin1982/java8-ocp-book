package org.ocp.pag136;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeueExample {
	public static void main(String[] args) {
		/*
		Queue<Integer> queue = new ArrayDeque<>();
		System.out.println(queue.offer(10));
		System.out.println(queue);
		
		System.out.println(queue.offer(4));
		System.out.println(queue);
		
		System.out.println(queue.peek());
		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue);
		
		System.out.println(queue.peek());
		System.out.println(queue);
		*/
		
		
	
		ArrayDeque<Integer> queue = new ArrayDeque<>();
		queue.offer(1);System.out.println("queue: " + queue);//offer agrega elemento a la cola
		queue.offer(2);System.out.println("queue: " + queue);
		queue.offer(3);System.out.println("queue: " + queue);
		queue.offer(4);System.out.println("queue: " + queue);
		System.out.println("regresa el siguiente elemento de la cola: " + queue.peek());System.out.println("queue: " + queue);
		System.out.println("elimina y regresa el siguiente elemento: " + queue.poll());System.out.println("queue: " + queue);
	}

}
