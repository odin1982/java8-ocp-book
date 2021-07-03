package org.ocp.pag309;

public class Assertions {
	public static void main(String[] args) {
		int numGuests = -5;
		assert numGuests > 0:"Error es menor a cero";
		System.out.println(numGuests);
	}
}
