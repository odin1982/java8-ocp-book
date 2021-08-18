package org.book.advancedClassDesign._06;

public class IceCream {
	enum Flavors{
		VANILLA, CHOCOLATE, STRAWBERRY
	}
	
	public static void main(String[] args) {
		Flavors f = Flavors.STRAWBERRY;
		switch(f) {
		case 0: System.out.println("vanilla");
		case 1: System.out.println("chocolate");
		case 2: System.out.println("strawberry");
		}
		
		//forma correcta de usar enum en switch
		
		switch(f) {
			case VANILLA: 		System.out.println("vanilla");
			case CHOCOLATE:	 	System.out.println("chocolate");
			case STRAWBERRY: 	System.out.println("strawberry");
		}
	}

}
