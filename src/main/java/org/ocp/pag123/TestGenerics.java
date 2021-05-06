package org.ocp.pag123;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics {
	public static void main(String[] args) {
		List<?> list1 = new ArrayList<A>();
		List<? extends A> list2 = new ArrayList<A>();
		List<? super A> list3 =  new ArrayList<A>();
		List<? extends B> list4 =  new Arraylist<A>();//DOES NOT COMPILE
		List<? super B> list5 = new ArrayList<A>();
		
		/*
		 Allows a reference to any generic type since it is an unbounded wildcard. 
		 The problem is that you need to know what type will be when instantiating the ArrayList
		 */
		// List<?> list6 =  new ArrayList<? extends A>();// DOES NOT COMPILE
		
		
		List<A> listOfA = new ArrayList<>();
		method4(listOfA);
	}
	
	/*
	<B extends A> B method3(List<B> list) {
		return new B();
	}
	*/
	
	static void method4(List<? super B> list) {
	
	}
	
	/*
	<X> void method5(List<X super B> list) {
		
	}
	*/
}
