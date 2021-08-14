package org.ocp.pag477;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesReadAllLinesSample {
	public static void main(String[] args) {
		Path path = Paths.get("/pruebas/a1.txt");
		
		try {
			final List<String> lines = Files.readAllLines(path);
			lines.stream().forEach(s -> System.out.println(s));
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
