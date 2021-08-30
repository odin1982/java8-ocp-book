package org.enthuware.advancedClassDesign._14;

public class TestClass extends Thread{
	class Runner implements Runnable{

		@Override 
		public void run() {
			Thread[] t = new Thread[5];
			for(int i=0;i<t.length;i++) System.out.println(t[i]);
		}
	}
	
	public static void main(String[] args) {
		TestClass tc = new TestClass();
		new Thread(tc.new Runner()).start();
	}
}
