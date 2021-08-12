package org.ocp.pag473;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
/**
 * 
 * @author odina
 * Si ya esta creado el directorio se mostrara una excepción 
 */
public class FilesCreateDirectories {
	public static void main(String[] args) throws IOException {
		//Files.createDirectory(Paths.get("/pruebas/createDirectory"));
		Files.createDirectories(Paths.get("/pruebas/errores/simples"));
	}
}
