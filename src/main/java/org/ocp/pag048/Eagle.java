package org.ocp.pag048;

public class Eagle implements Fly{
	/*
	 * 	Due to the rules of method overriding,this doesnt not require the exception
		to be declared in the overridden method in the Eagle class
	*/
	public int getWingSpan() {
		return 15;
	}
	
	public void land() {
		System.out.println("Eagle is diving fast");
	}
}
