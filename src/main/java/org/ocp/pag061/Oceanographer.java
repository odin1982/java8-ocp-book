package org.ocp.pag061;

public class Oceanographer {
	public void checkSound(LivesInOcean animal) {
		animal.makeSound();
	}
	
	public static void main(String[] args) {
		Oceanographer o = new Oceanographer();
		o.checkSound(new Whale());
		o.checkSound(new Dolphin());
	}
}
