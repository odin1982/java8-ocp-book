package org.enthuware.advancedClassDesign._11;

public enum Coffee {
	ESPRESSO("Very Strong"),MOCHA,LATTE;
	public String strength;
	
	Coffee(String strength){
		this.strength = strength;
	}
}
//	ESPRESSO("Very Strong"),MOCHA(""),LATTE("");
