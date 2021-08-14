package org.ocp.pag491;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ListingDirectoryContents {
	public static void main(String[] args) {
		try {
			Path path = Paths.get("/pruebas/app");
			Files.list(path)
				.filter(p -> !Files.isDirectory(p))
				.map(p-> p.toAbsolutePath())
				.forEach(System.out::println);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
