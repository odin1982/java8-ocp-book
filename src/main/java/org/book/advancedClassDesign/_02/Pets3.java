package org.book.advancedClassDesign._02;

public enum Pets3 {
	DOG(1,"D"),
	CAT(2,"C"){
		public String getData() {
			return type + name;
		}
	},
	FISH(3,"F");
	
	int type;
	String name;
	
	Pets3(int t, String s){
		this.name = s;
		this.type = t;
	}
	
	public String getData() {
		return name +  type;
	}
}
