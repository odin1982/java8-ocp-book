package org.ocp.pag029;

public class ExampleEffectivelyFinal {
	public void isItFinal() {
		int one = 20;
		int two = 20;
		two++;
		int three;
		if( one == 4 ) three = 3;
		else three = 4;
		int four = 4;
		class Inner{
			
		}
		four = 5;
	}
}
