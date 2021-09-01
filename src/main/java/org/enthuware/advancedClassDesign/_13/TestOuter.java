package org.enthuware.advancedClassDesign._13;

public class TestOuter {
	public void myOuterMethod() {
		//1
		//new TestInner();
	}
	public class TestInner{}
	public static void main(String args[]) {
		TestOuter to =  new TestOuter();
		//2
		//new TestInner();//a
		//new to.TestInner();
		//new TestOuter.TestInner();//b
		//new TestOuter().new TestInner();//c
	}
}


// a - si la convertimos la clase TestInner static no exitiria problema
// b - existen dos tipos de solucion volver la clase statica o declararla como c 