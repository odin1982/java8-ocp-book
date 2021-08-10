package org.enthuware.advancedClassDesign._07;

public class Outer {
	int i =10;
	
	class Inner{
		public void methodA() {
			// System.out.println(this.i);
			// System.out.println(i);
			// System.out.println(Outer.this.i);
		}
	}
}
