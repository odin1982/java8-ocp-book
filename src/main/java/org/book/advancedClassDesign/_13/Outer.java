package org.book.advancedClassDesign._13;

public class Outer {
	class Inner{}
	public static void main(String[] args) {
		//Inner in = new Inner();
		//Inner in = new Outer.new Inner();
		//Outer.Inner in = new Outer.Inner();
		//Outer.Inner in = new Outer().new Inner();
		//Outer.Inner in = Outer.new Inner();
	}
}
