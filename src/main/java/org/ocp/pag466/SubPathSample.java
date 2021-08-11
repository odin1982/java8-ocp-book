package org.ocp.pag466;

import java.nio.file.Path;
import java.nio.file.Paths;

public class SubPathSample {
	public static void main(String[] args) {
		
		//0-pruebas, 1-subfolder, 2-test.txt
		Path path = Paths.get("/pruebas/subfolder/test.txt");
		System.out.println("Path is: " + path);
		
		System.out.println( "Subpath from 0 to 3 is: " + path.subpath(0, 3) );
		System.out.println( "Subpath from 0 to 3 is: " + path.subpath(1, 3) );
		System.out.println( "Subpath from 0 to 3 is: " + path.subpath(1, 2) );
		
		try {
			System.out.println( "Subpath from 0 to 4 is: " + path.subpath(0, 4) );
		}catch(Exception e) { 
			System.out.println( "Solo se puede usar hasta el indice 3" );
		}
		
		try {
			System.out.println( "Subpath from 1 to 1 is: " + path.subpath(1, 1) );
		}catch(Exception e) { 
			System.out.println( "Indices invalidos 1 to 1" );
		}
		
	}
}
