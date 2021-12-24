package org.book.advancedClassDesign._02;

public enum Pets2 {
	DOG("D"), CAT("C"), FISH("F");
	static String prefix = "I am";
	String name;
	
	Pets2(String s){
		name = prefix + s;
	}
	
	public String getData() { return name; }
}

//Nota: No se permiten atributos estaticos en constructores;