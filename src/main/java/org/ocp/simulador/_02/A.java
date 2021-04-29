package org.ocp.simulador._02;

public class A {
	public A() {
		System.out.println("Entro a A()");
	} //A1
	public A(String s) {
		this(); 
		System.out.println("A :" + s);
	}
	
	
	
	public static void main(String[] args) {
		
	}
}

class B extends A{
	public int B(String s) {
		System.out.println("B:"+s);
		return 0;
	} 
}

class C extends B{
	private C() {  
		super(); //C1
	}
	public C(String s) {
		this();
		System.out.println("C: " + s);//c2
	}
	
	public C(int i) {} //C3
}
