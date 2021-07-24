package org.ocp.pag410;

import java.io.File;

/**
 * 
 * @author odina
 *	Lee informacion de un archivo o de un directorio
 */
public class ReadFileInformation {
	public static void main(String[] args) {
		//File file = new File("C:\\Users\\odina\\Documents\\eclipse-workspace\\java\\java8-ocp-book\\src\\main\\resources\\prueba.txt");
		File file = new File("C:\\Users\\odina\\Documents\\eclipse-workspace\\java\\java8-ocp-book\\src\\main\\resources");
		System.out.println("File exits:" + file.exists());
		if(file.exists()) {
			System.out.println( "Absolute Path: " + file.getAbsolutePath() );
			System.out.println( "Is Directory: "  + file.isDirectory() );
			System.out.println( "Perent path: "   + file.getParent() );
			
			if(file.isFile()) {
				System.out.println( "File size: " + file.length() );
				System.out.println( "File LastModified: " + file.lastModified() );
			}else {
				for( File subFile: file.listFiles() ) {
					System.out.println( "\t" + subFile.getName() );
				}
			}
		}
	}
}
