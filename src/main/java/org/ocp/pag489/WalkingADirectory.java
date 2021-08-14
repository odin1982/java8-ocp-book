package org.ocp.pag489;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WalkingADirectory {
	public static void main(String[] args) {
		Path path = Paths.get("/pruebas ");
		try {
			Files.walk(path)
				.filter(p -> p.toString().endsWith(".java"))
				.forEach(System.out::println);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
