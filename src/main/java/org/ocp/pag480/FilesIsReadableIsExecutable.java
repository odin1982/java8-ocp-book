package org.ocp.pag480;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesIsReadableIsExecutable {
	public static void main(String[] args) {
		System.out.println(Files.isReadable(Paths.get("/pruebas/a1.txt")));
		System.out.println(Files.isExecutable(Paths.get("/pruebas/no-readable.txt")));
		
		try {
			System.out.println(Files.isHidden(Paths.get("/pruebas/no-readable.txt")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
