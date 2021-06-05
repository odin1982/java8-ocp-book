package org.ocp.pag211;

import java.util.function.BooleanSupplier;

public class FunctionalInterfacesBoolean {
	// Parameter =0, ReturnType=1, get
	public static void main(String[] args) {
		BooleanSupplier b1 = () -> true;
		BooleanSupplier b2 = () -> Math.random() > .5;
		System.out.println(b1.getAsBoolean());
		System.out.println(b2.getAsBoolean());
	}
}
