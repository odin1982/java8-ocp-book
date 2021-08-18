package org.book.advancedClassDesign._14;

public enum AnimalClasses {
	//Falta punto y coma al final cuando se usa algun tipo de constructor
	MAMMAL(true),FISH(Boolean.FALSE),BIRD(false),REPTILE(false),AMPHIBIAN(false),INVERTEBRATE(false)
	
	boolean hasHair;
	//Debe ser private el constructor de un enum
	public AnimalClasses(boolean hasHair) {
		this.hasHair = hasHair;
	}
	
	public boolean hasHair() {
		return hasHair;
	}
	
	public void giveWig() {
		hasHair =  true;
	}
	
}
