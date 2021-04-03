package org.ocp.pag048;
public interface Fly {
	public int getWingSpan() throws Exception;
	public static final int MAX_SPEED = 100;
	
	// a default method is optionally overriden
	public default void land() {
		System.out.println("Animal is landing");
	}
	
	// it's available without an instance of the interface
	public static double calculateSpeed(float distance, double time) {
		return distance/time;
	}
}
