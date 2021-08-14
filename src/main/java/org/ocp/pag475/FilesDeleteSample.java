package org.ocp.pag475;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
// delete - Si no existe el archivo lanza excepcion
// deleteIf - Si no existe el archivo no lanza excepcion 
public class FilesDeleteSample {
	public static void main(String[] args) {
		try {
			// Files.delete( Paths.get("/pruebas/source-data.txt") );
			Files.deleteIfExists( Paths.get("/pruebas/source-data.txt") );
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
