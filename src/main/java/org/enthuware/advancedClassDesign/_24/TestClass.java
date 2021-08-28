package org.enthuware.advancedClassDesign._24;

interface House{
	public default String getAddress() {
		return "101 Main Str";
	}
}

interface Office{
	public default String getAddress() {
		return "101 Smart Str";
	}
}

class HomeOffice implements House,Office{
	public String getAddress() {
		return "R No 1,Home";
	}
}

public class TestClass {
	public static void main(String[] args) {
		House h = new HomeOffice();
		System.out.println(h.getAddress());
	}
}
