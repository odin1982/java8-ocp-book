package org.book.advancedClassDesign._07;

public class Outer {
	private int x = 5;
	protected class Inner{
		public static int x = 10;
		public void go() { System.out.println(x); }
	}
	
	public static class InnerStatic{
		public static int x = 10;
		public void go() { System.out.println(x); }
	} 
	
	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		in.go();
	}

}

//Nota: Solo clases anidadas estaticas tienen permitido tener atributos estaticos
