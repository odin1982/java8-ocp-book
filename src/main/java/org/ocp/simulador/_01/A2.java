package org.ocp.simulador._01;

public class A2 {
	A2(){
		print();
	}
	private void print() {
		System.out.println("A");
	}
}

class B extends A2{
	int i = Math.round(3.5f);
	public static void main(String[] args) {
		A2 a = new B();
		a.print();
	}
	
	void print() {
		System.out.println(i);
	}
}
