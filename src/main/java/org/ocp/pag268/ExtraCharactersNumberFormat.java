package org.ocp.pag268;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExtraCharactersNumberFormat {
	public static void main(String[] args) throws ParseException {
		NumberFormat nf = NumberFormat.getInstance();
		String one = "456abc";
		String two = "-2.5165x10";
		String three = "x85.3";
		
		System.out.println(nf.parse(one));
		System.out.println(nf.parse(two));
		//System.out.println(nf.parse(three));
		
	}
}
