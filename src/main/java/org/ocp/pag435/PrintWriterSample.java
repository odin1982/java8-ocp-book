package org.ocp.pag435;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterSample {
	public static void main(String[] args) throws IOException {
		File source = new File("C://pruebas//zoo.log");
		
		try(PrintWriter out = new PrintWriter( new BufferedWriter(new FileWriter(source))) ){
			out.print("Today's weather is: ");
			out.print("Sunny");
			out.print("Today's temperasture at the zoo is: ");
			out.print(1/3.0);
			out.print('C'); 
		}
	}
}
