package org.ocp.pag268;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatNumbers {
	public static void main(String[] args) {
		int attendeesPerYear = 3_200_000;
		int attendessPerMonth = attendeesPerYear / 12;
		Locale localeMexico = new Locale("es","MX");
		NumberFormat us = NumberFormat.getInstance(Locale.US);
		NumberFormat mx = NumberFormat.getInstance(localeMexico);
		NumberFormat ger = NumberFormat.getInstance(Locale.GERMANY);
		NumberFormat fr = NumberFormat.getInstance(Locale.CANADA_FRENCH);
		
		System.out.println(us.format(attendessPerMonth));
		System.out.println(mx.format(attendessPerMonth));
		System.out.println(ger.format(attendessPerMonth));
		System.out.println(fr.format(attendessPerMonth));
		
		double price = 48;
		us = NumberFormat.getCurrencyInstance(Locale.US);
		mx = NumberFormat.getCurrencyInstance(localeMexico);
		ger = NumberFormat.getCurrencyInstance(Locale.GERMANY);
		fr = NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH);
		
		System.out.println(us.format(price));
		System.out.println(mx.format(price));
		System.out.println(ger.format(price));
		System.out.println(fr.format(price));
		
	}
}
