package org.enthuware.advancedClassDesign._04;

class A{}

public class TestClass {
	public class A{
		public void m() {}
	}
	
	class B extends A{}
	
	public static void main(String[] args) {
		new TestClass().new A() {
			public void m() {}
		};
	}
}
