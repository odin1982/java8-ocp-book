package org.ocp.pag464;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathFilePathTest {
	public static void printPathInformation( Path path ) {
		System.out.println( "Filename is: " + path.getFileName() );
		System.out.println( "Root is: " + path.getRoot() );
		
		Path currentParent = path;
		while((currentParent = currentParent.getParent()) != null) {
			System.out.println("Current parent is: " + currentParent );
		}
	}
	
	public static void main(String[] args) {
		printPathInformation(Paths.get("C:\\pruebas\\a1.txt"));
		System.out.println();
		printPathInformation(Paths.get("C:\\pruebas\\subfolder\\test.txt"));
	}

}
