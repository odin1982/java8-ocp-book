package org.ocp.pag025;

public class Outer {
	private String greeting = "Hi";
	
	//member inner class
	protected class Inner{
		public int repeat = 3;
		
		public void go() {
			for(int i=0;i<repeat;i++) {
				System.out.println(greeting);
			}
		}
	}
	
	public void callInner() {
		Inner inner = new Inner();
		inner.go();
	}
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.callInner();
		
		//another way to instanciate inner
		Outer outer2 = new Outer();
		Inner inner = outer2.new Inner();
		inner.go();
	}
}
