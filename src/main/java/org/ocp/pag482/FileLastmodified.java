package org.ocp.pag482;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;

public class FileLastmodified {
	public static void main(String[] args) {
		try {
			final Path path = Paths.get("/pruebas/a1.txt");
			System.out.println(Files.getLastModifiedTime(path).toMillis());
			Files.setLastModifiedTime(path, FileTime.fromMillis(System.currentTimeMillis()));
			System.out.println(Files.getLastModifiedTime(path).toMillis());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
