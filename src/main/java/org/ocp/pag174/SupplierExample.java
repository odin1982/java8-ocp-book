package org.ocp.pag174;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {
		Supplier<LocalDate> s1 = () -> LocalDate.now();
		Supplier<LocalDate> s2 = LocalDate::now;
		
		System.out.println("supplier-localdate s1: " + s1.get());
		System.out.println("supplier-localdate s2: " + s2.get());
		
		Supplier<StringBuilder> s3 = StringBuilder::new;
		Supplier<StringBuilder> s4 = () -> new StringBuilder();
		
		System.out.println("supplier-stringbuilder s3: " + s3.get());
		System.out.println("supplier-stringbuilder s4: " + s4.get());
		
	}
}
