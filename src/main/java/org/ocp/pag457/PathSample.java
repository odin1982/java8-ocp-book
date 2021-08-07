package org.ocp.pag457;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathSample {
	public static void main(String[] args) {
		Path path1 = Paths.get("C:\\pruebas\\a1.txt");
		Path path2 = Paths.get("C:\\pruebas\\a2.txt");
		
		Path path3 = Paths.get("C:","pruebas","a1.txt");
	} 
}
