package org.ocp.pag118;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildCards {
	
	//pag 118
	/*public static void printList(List<Object> list) {
		for(Object x: list)System.out.println(x);
	}
	
	public static void main(String[] args) {
		List<String> keywords = new ArrayList<>();
		keywords.add("java");
		printList(keywords); //DOES NOT COMPILE
	}*/
	
	//pag 119
	public static void printList(List<?> list) {
		for(Object x: list)System.out.println();
	}
	
	public static void main(String[] args) {
		List<String> keywords =  new ArrayList<>();
		keywords.add("java");
		printList(keywords);
	}
}
