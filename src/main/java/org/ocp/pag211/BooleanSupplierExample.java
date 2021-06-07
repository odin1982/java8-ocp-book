package org.ocp.pag211;

import java.util.function.BooleanSupplier;

public class BooleanSupplierExample {
	public static void main(String[] args) {
		BooleanSupplier b1 = ()-> true;
		BooleanSupplier b2 = ()-> Math.random() > .5;
	}

}
