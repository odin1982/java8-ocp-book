package org.book.advancedClassDesign._04;

public class BaseballTeam {
	private String city,mascot;
	private int numberOfPlayers;
	
	public boolean equals(Object obj) {
		if(!(obj instanceof BaseballTeam))
			return false;
		BaseballTeam other = (BaseballTeam)obj;
		return (city.equals(other.city) && mascot.equals(other.mascot));
	}
	
	public int hashCode() {
		return numberOfPlayers;
	}

}

/*
 * Nota: en el hashcode se deben usar atributos usados en el equals sino es una mala implementacion del hashcode 
 */
