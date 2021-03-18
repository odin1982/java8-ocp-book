package org.ocp.pag011;

import org.apache.log4j.Logger;

abstract class Animal {
	static final Logger logger = Logger.getLogger(Animal.class);
	public void careFor() {
		play();
	}
	
	public void play() {
		logger.info("pet animal");
	}
}

class Lion extends Animal {
	static final Logger logger = Logger.getLogger(Lion.class);
	
	@Override
	public void play() {
		logger.info("toss in meat");
	}
}

public class PlayWithAnimal{
	public static void main(String[] args) {
		Animal animal = new Lion();
		animal.careFor();
	}
}


