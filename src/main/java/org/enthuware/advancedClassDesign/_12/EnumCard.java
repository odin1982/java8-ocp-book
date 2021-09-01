package org.enthuware.advancedClassDesign._12;

public class EnumCard {
	public static void main(String[] args) {
//		for(int i=0; i<4;i++) {
//			System.out.println(Card[i] + " ");
//		}
		
//		while(Card.hasNext()) {
//			System.out.println(Card.next() + " ");
//		}
	
		for(Card c:Card.values()) {
			System.out.println(c + " ");
		}
	}
}


enum Card{
	HEART,CLUB,SPADE,DIAMOND;
}
