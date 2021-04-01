package org.ocp.pag032;

public class Enclosing {
	static class Nested{
		private int price = 6;
	}
	
	public static void main(String[] args) {
		Nested nested = new Nested();
		System.out.println(nested.price);
		
		Enclosing.Nested nested2 = new Enclosing.Nested();
		System.out.println(nested2.price);
	}
}
