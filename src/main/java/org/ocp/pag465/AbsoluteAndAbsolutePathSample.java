package org.ocp.pag465;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AbsoluteAndAbsolutePathSample {
	public static void main(String[] args) {
		
		Path path1 = Paths.get( "C:\\pruebas\\a1.txt" );
		System.out.println( "Path1 is absolute? " + path1.isAbsolute() );
		System.out.println( "Absolute Path1: " + path1.toAbsolutePath() );
		
		String basePath = new File("").getAbsolutePath();
	    System.out.println("Absolute path: " + basePath);
		Path path2 = Paths.get( "src/main/java/org/ocp/pag457/PathSample.java" );
		System.out.println( "Path2 is absolute? " + path2.isAbsolute() );
		System.out.println( "Absolute Path2: " + path2.toAbsolutePath() );

	}
}
