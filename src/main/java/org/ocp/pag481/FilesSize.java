package org.ocp.pag481;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesSize {
	public static void main(String[] args) {
		try {
			System.out.println(Files.size(Paths.get("/pruebas/a1.txt"))+" bytes");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
