package org.ocp.pag268;

import java.text.NumberFormat;
import java.text.ParseException;

public class StringWithCurrencyFormatToPrimitive {
	public static void main(String[] args) throws ParseException {
		String amt = "$92,807.99";
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		double value = (Double)cf.parse(amt);
		System.out.println(value);
	}
}
