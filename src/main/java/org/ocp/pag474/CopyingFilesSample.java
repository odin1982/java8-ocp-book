package org.ocp.pag474;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CopyingFilesSample {
	public static void main(String[] args){
		try(	InputStream is = new FileInputStream("/pruebas/source-data.txt");
				OutputStream out = new FileOutputStream("/pruebas/output-data.txt")){
			Files.copy(is, Paths.get("c:\\pruebas\\wolf.txt"));
			Files.copy(Paths.get("c:\\pruebas\\clown.xsl"),out);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
