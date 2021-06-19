package org.ocp.pag261;

import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

public class ResourceBoundleGetAllKeys {
	public static void main(String[] args) {
		Locale us = new Locale("en","US");
		ResourceBundle rb = ResourceBundle.getBundle("Zoo", us);
		Set<String> keys = rb.keySet();
		keys.stream().map(k -> k + " " + rb.getString(k)).forEach(System.out::println);
		
		//ResourceBoundle convert to Properties
		Properties props = new Properties();
		rb.keySet().stream().forEach(k -> props.put(k, rb.getString(k)));
		
		System.out.println(props.getProperty("any"));//No existe manda null
		System.out.println(props.getOrDefault("any", "No existe"));//Si no existe pone el valor por default que es el String "No existe"
	}

}
