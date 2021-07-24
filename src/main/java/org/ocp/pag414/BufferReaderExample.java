package org.ocp.pag414;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample {
	private static final String PATH = "C:\\Users\\odina\\Documents\\eclipse-workspace\\java\\java8-ocp-book\\src\\main\\resources\\prueba.txt";
	public static void main(String[] args) throws IOException {
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH))){
			System.out.println(bufferedReader.readLine());
		}
	}
}
