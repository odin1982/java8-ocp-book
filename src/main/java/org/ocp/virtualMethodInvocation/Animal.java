package org.ocp.virtualMethodInvocation;

public abstract class Animal {
	public abstract void feed();
}

class Cow extends Animal{

	@Override
	public void feed() {
		addHay();
	}
	private void addHay() {}
	
}
