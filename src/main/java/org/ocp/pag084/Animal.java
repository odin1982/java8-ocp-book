package org.ocp.pag084;

import java.util.ArrayList;
import java.util.List;

public class Animal {
	private final String species;
	private final int age;
	private final List<String> favoriteFoods;
	
	public Animal(String species, int age, List<String> favoriteFoods) {
		this.species = species;
		this.age = age;
		
		if(favoriteFoods == null) {
			throw new RuntimeException("favoritefoods is required");
		}
		this.favoriteFoods = new ArrayList<String>(favoriteFoods);
	}

	public String getSpecies() {
		return species;
	}

	public int getAge() {
		return age;
	}

	public int getFavoriteFoodscount() {
		return favoriteFoods.size();
	}
	
	public String getFavoriteFood(int index) {
		return favoriteFoods.get(index);
	}

}
