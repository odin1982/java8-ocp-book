package org.ocp.pag463;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathBasicMethods {
	public static void main(String[] args) {
		Path path = Paths.get("C:\\pruebas\\a1.txt");
		System.out.println("The path name is: " + path);
		
		for(int i=0;i<path.getNameCount();i++) {
			System.out.println(" Element " + i + " is:" +path.getName(i));
		}
	}
}
