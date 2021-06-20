package org.ocp.pag268;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class FormatNumbersException {
	public static void main(String[] args) throws ParseException {
		NumberFormat en = NumberFormat.getInstance(Locale.US);
		NumberFormat fr = NumberFormat.getInstance(Locale.FRANCE);
		
		String s = "40.45";
		System.out.println(en.parse(s));
		System.out.println(fr.parse(s));
	}
}
