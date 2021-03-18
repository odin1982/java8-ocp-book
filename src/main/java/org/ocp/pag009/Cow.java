package org.ocp.pag009;

public class Cow extends Animal{

	@Override
	public void feed() { 
		addHay();
	}
	
	private void addHay() {};

}
