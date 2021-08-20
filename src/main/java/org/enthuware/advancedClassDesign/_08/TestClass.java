package org.enthuware.advancedClassDesign._08;

public class TestClass {
	public static void main(String[] args) {
		Outer outer = new Outer();
		System.out.println(outer.getInner().getOi());
	}

}

class Outer{
	private int oi = 20;
	class Inner{
		int getOi() { return oi; }
	}
	
	Inner getInner() {
		return new Inner();
	}
			
}