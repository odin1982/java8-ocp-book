package org.ocp.pag480;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesIsHidden {
	public static void main(String[] args) {
		try {
			System.out.println(Files.isHidden(Paths.get("/pruebas/a1.txt")));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
