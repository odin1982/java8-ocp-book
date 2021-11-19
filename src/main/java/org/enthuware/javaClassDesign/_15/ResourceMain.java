package org.enthuware.javaClassDesign._15;

public class ResourceMain {
	public static void main(String[] args) {
		boolean equals = new Resource().equals(new Object());
		System.out.println("equals: " + equals);
		
		
		boolean equals2 = new Resource().equals(new Resource());
		System.out.println("equals2: " + equals2);
	}
}
