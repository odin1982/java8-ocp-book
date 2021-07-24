package org.ocp.pag414;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class HighLevelReadHigLevelStream {
	private static final String PATH = "C:\\Users\\odina\\Documents\\eclipse-workspace\\java\\java8-ocp-book\\src\\main\\resources\\prueba.txt";
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		try(ObjectInputStream objectStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(PATH)))){
			System.out.println(objectStream.readObject());
		}
	}
}
