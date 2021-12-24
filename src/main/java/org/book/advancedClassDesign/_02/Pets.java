package org.book.advancedClassDesign._02;

public enum Pets {
	DOG("D"), CAT("C"), FISH("F");
	String name;
	
	Pets(String s){}
	
	public String getData() { return name; }
}
