package org.enthuware.javaClassDesign._05;

public class StaticTestExplicacion {
	static {
		System.out.println("In static");
	}
	
	{
		System.out.println("In non - static");
	}
	
	public static void main(String[] args) {
		StaticTest st1;//Aun no instanciado se manda a llamar el metodo statico y s eejecuta una sola vez por clase
		System.out.println(" 1 ");
		st1 = new StaticTest();
		System.out.println(" 2 ");
		StaticTest st2 = new StaticTest();
	}

}
