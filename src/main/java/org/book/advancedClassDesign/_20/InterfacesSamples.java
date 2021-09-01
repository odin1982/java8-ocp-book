package org.book.advancedClassDesign._20;

public class InterfacesSamples {

}

interface Book{
	public default String getId() {
		return "ISBN123456";
	}
}

interface Encyclopedia extends Book{
//	static String getId() {
//		return "AIN8888";
//	}
	
//	String getId();
	
//	public default String getId() { 
//		return  "AIN8888";
//	}
	
	//abstract static String getName();
	
	//static String getAuthor();
	
	default String getAuthor();
}