package org.ocp.pag266;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBoundleFindExample {
	public static void main(String[] args) {
		Locale locale = new Locale("en","CA");
		ResourceBundle rb = ResourceBundle.getBundle("ej265/Zoo", locale);
		System.out.print(rb.getString("hello"));
		System.out.print(". ");
		System.out.print(rb.getString("name"));
		System.out.print(" ");
		System.out.print(rb.getString("open"));
		System.out.print(" ");
		System.out.print(rb.getString("visitor"));
		
		System.out.println();
		String format = rb.getString("oso");
		String formatted = MessageFormat.format(format, "Tammy");
		System.out.println(formatted);
	}
}
