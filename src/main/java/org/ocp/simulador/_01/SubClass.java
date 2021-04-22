package org.ocp.simulador._01;

public class SubClass extends SuperClass{
	int i,j,k;
	public SubClass(int m,int n) {
		i=m;
		j=m;
	}
	public SubClass(int m) {
		super(m);
	}
}

class SuperClass{
	public SuperClass(int a) {
		
	}
	
	public SuperClass(){
		
	}
}