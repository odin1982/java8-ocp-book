package org.enthuware.advancedClassDesign._15;

public class InterfaceTest {}

interface Book{
	public default String getId() {
		return "ISBN123456";
	}
}

interface Encyclopedia extends Book{
	//INSERT CODE HERE

	//	static String getId() {
	//		return "AIN8888";
	//	}
		
	//String getId();
		
	//	default String getId() {
	//		return "AIN8888";
	//	}
		
	//	abstract static String getName();
	//	static String getAuthor();
	//	default String getAuthor();
}
