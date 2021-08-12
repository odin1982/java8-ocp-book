package org.ocp.pag472;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesIsSameFileSample {
	public static void main(String[] args) throws IOException {
		System.out.println("is same file: " + Files.isSameFile(Paths.get("/pruebas/a1.txt"), Paths.get("/pruebas/a1.txt")));
	}
}
