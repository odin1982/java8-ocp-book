package org.ocp.pag120;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundInterface {
	private static void anyFlyer(List<Flyer> flyer) {}
	private static void groupOfFlyers(List<? extends Flyer> flyer) {}
	
	public static void main(String[] args) {
		ArrayList<Flyer> f = new ArrayList<>();
		ArrayList<HangGlider> h = new ArrayList<>();
		anyFlyer(f);
		anyFlyer(h);// DOES NOT COMPILE
		
		groupOfFlyers(f);
		groupOfFlyers(h);
	}
}
