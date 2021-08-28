package org.enthuware.advancedClassDesign._23;

public enum EnumA{A,AA,AAA};

public class TestClassEnum {
	public enum EnumB{B,BB,BBBB};
	public static enum EnumC{C,CC,CCC};
	
	public TestClassEnum() {
		enum EnumD{D,DD,DDD}//no puede ir dentro de un constructor
	}
	
	public void methodX() {
		public enum EnumE{E,EE,EEE}//no puede ir dentro de un metodo 
	}
	
	public static void main(String[] args) {
		enum EnumF{F,F,FFF}
	}

}
