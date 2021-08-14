package org.ocp.pag476;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WritingFileData {
	public static void main(String[] args) {
		Path path = Paths.get("/pruebas/output-data.txt");
		List<String> data = new ArrayList();
		
		try(BufferedWriter writer = Files.newBufferedWriter(path, Charset.forName("UTF-8"))){
			writer.write("Hello world");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
