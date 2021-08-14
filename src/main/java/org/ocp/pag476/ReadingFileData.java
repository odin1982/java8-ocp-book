package org.ocp.pag476;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadingFileData {
	public static void main(String[] args) {
		Path path = Paths.get("/pruebas/a1.txt");
		
		try( BufferedReader reader = Files.newBufferedReader(path,Charset.forName("UTF-8"))){
			String currentLine = null;
			
			while( (currentLine = reader.readLine()) != null ) {
				System.out.println(currentLine);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
