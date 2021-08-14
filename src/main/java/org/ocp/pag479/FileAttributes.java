package org.ocp.pag479;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileAttributes {
	public static void main(String[] args) {
		System.out.println(Files.isDirectory(Paths.get("/pruebas/subfolder")));
		System.out.println(Files.isDirectory(Paths.get("/pruebas/a1.txt")));
		
		System.out.println(Files.isRegularFile(Paths.get("/pruebas/subfolder")));
		System.out.println(Files.isRegularFile(Paths.get("/pruebas/a1.txt")));
		
		System.out.println(Files.isSymbolicLink(Paths.get("/pruebas/subfolder")));
		System.out.println(Files.isSymbolicLink(Paths.get("/pruebas/a1.txt")));
	}
}
