package org.ocp.pag408;

import java.io.File;

public class FileSample {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\odina\\Documents\\eclipse-workspace\\java\\java8-ocp-book\\src\\main\\resources\\prueba.txt");
		System.out.println("file exists: " + file.exists());
		
		File file2 = new File("C:\\prueba.txt");
		System.out.println("file exists: " + file2.exists());
	}
}
