package org.enthuware.advancedClassDesign._05;

interface Boiler{
	public void boil();
	public static void shutdown() {
		System.out.println("shutting down");
	}
}

interface Vaporizer extends Boiler{
	public default void vaporize() {
		boil();
		System.out.println("Vaporized");
	}
}

public class Reactor implements Vaporizer{

	@Override
	public void boil() {
		Vaporizer v = new Reactor();
		v.vaporize();
		v.shutdown();
	}

}
