package org.enthuware.advancedClassDesign._27;

public class TestInterface {

}

//interface Measurement{
//	public int getLength() {
//		return 0;
//	}
//}
//
//interface Size extends Measurement{
//	public int getLength();
//}


//interface Measurement{
//	public default int getLength() {
//		return 0;
//	}
//	
//	public static int getBreadth() {
//		return 0;
//	}
//}
//
//interface Size extends Measurement{
//	public static final int UNIT = 100;
//	public static int getLength() { return 10;}
//}


//interface Measurement{
//	public int getLength();
//	public static int getBreadth() {
//		return 0;
//	}
//}
//
//interface Size extends Measurement{}


//interface Measurement{
//	public default final int getUnit() { return 100;}
//}
//
//interface Size extends Measurement{
//	public int getLength();
//}