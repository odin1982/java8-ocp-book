package org.ocp.pag472;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesExistSample {
	public static void main(String[] args) {
		System.out.println("exist: " + Files.exists(Paths.get("/pruebas/a1.txt")));
		System.out.println("exist: " + Files.exists(Paths.get("/pruebas/a9.txt")));
	}
}
