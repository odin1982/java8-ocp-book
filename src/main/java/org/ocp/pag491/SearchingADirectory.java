package org.ocp.pag491;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class SearchingADirectory {
	public static void main(String[] args) {
		Path path = Paths.get("/pruebas");
		long dateFilter = 1420070400000l;
		
		try {
			Stream<Path> stream = Files.
					find(path,10,(p,a)-> p.toString().endsWith(".java") && 
										a.lastModifiedTime().toMillis()>dateFilter);
			stream.forEach(System.out::println);
			
		}catch(Exception e) {
			
		}
	}
}
