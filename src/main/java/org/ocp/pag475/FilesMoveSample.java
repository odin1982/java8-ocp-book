package org.ocp.pag475;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesMoveSample {
	public static void main(String[] args){
		try {
			Files.move(Paths.get("/pruebas/wolf.txt"), Paths.get("/ pruebas/documentos/wolff.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
