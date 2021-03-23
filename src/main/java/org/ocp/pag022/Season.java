package org.ocp.pag022;

public enum Season {
	WINTER("Low"),SPRING("Medium"),SUMMER("High"),FALL("Medium");
	
	private String expectedVisitors;  
	private Season(String expectedVisitors) {
		this.expectedVisitors = expectedVisitors;
	}
	
	public void printExpectedVisitors() {
		System.out.println(expectedVisitors);
	}
}
