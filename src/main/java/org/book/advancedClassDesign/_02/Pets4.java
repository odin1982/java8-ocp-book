package org.book.advancedClassDesign._02;

public enum Pets4 {
	String name;
	DOG("D"), CAT("C"), FISH("F");
	Pets4(String s){
		name = s;
	}
	
	public String getData() { return name; }
}
//Nota: las variables deben ir abajo de la definición de los Enums