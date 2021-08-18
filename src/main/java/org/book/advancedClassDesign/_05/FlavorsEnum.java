package org.book.advancedClassDesign._05;

public class FlavorsEnum {
	enum Flavors{
		VANILLA, CHOCOLATE, STRABERRY
	}
	
	public static void main(String[] args) {
		System.out.println(Flavors.CHOCOLATE.ordinal());
	}
}
