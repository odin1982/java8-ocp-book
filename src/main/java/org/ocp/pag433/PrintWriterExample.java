package org.ocp.pag433;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.ocp.pag428.Animal;

public class PrintWriterExample {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter out = new PrintWriter("C://pruebas//zoo.log");
		
		out.print(5);
		out.write(String.valueOf(5));
		
		out.print(2.0);
		out.write(String.valueOf(2.0));
		
		Animal animal = new Animal();
		out.print(animal);
		out.write(animal == null ? "null" : animal.toString());
	}
}
