package org.ocp.pag083;

import java.util.ArrayList;
import java.util.List;

public final class Animal {
	private final List<String> favoriteFoods;
	private String species;
	private int age;
	
	public Animal(String species,int age,List<String> favoriteFoods) {
		if(favoriteFoods == null) {
			throw new RuntimeException("favoriteFoods is required");
		}
		this.favoriteFoods = new ArrayList<String>(favoriteFoods);
		this.species = species;
		this.age  = age;
	}
	
	public List<String> getFavoriteFoods(){//MAKES CLASS MUTABLE
		return favoriteFoods;
	}

	public String getSpecies() {
		return species;
	}

	public int getAge() {
		return age;
	}

}
