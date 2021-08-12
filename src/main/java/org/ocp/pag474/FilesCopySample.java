package org.ocp.pag474;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesCopySample {
	public static void main(String[] args) throws IOException {
		// Files.copy(Paths.get("/pruebas/errores"), Paths.get("/pruebas/errores2"));
		Files.copy(	 Paths.get("/pruebas/errores/err1.txt"), 
					Paths.get("/pruebas/errores2/err3.txt"));
		
	}
}
