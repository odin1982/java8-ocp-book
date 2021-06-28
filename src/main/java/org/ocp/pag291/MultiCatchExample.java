package org.ocp.pag291;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class MultiCatchExample {
	public static void main(String[] args) {
		//COMMENT-Case 1:
		//COMMENT-We are ducplicating code with two catch that is no a good practice
		try {
			Path path = Paths.get("dolphinsBorn.txt");
			String text = new String(Files.readAllBytes(path));
			LocalDate date = LocalDate.parse(text);
			System.out.println(date);
		}catch(DateTimeParseException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}catch(IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
		//COMMENT-Case 2:
		//COMMENT-The ducplicate code is gone, but we catch another exceptions 
		try {
			Path path = Paths.get("dolphinsBorn.txt");
			String text = new String(Files.readAllBytes(path));
			LocalDate date = LocalDate.parse(text);
			System.out.println(date);
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
		//COMMENT-Case 3:
		//COMMENT-We still have a little duplication
		
		try {
			Path path = Paths.get("dolphinsBorn.txt");
			String text = new String(Files.readAllBytes(path));
			LocalDate date = LocalDate.parse(text);
			System.out.println(date);
		}catch(DateTimeParseException e) {
			handleException(e);
		}catch(IOException e) {
			handleException(e);
		}
		
		//COMMENT-Multicatch example
		try {
			Path path = Paths.get("dolphinsBorn.txt");
			String text = new String(Files.readAllBytes(path));
			LocalDate date = LocalDate.parse(text);
			System.out.println(date);
		}catch(DateTimeParseException | IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
	}
	
	public static void handleException(Exception e) {
		e.printStackTrace();
		throw new RuntimeException(e);
	}
}
