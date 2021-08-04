package org.ocp.pag419;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MarkExample {
	public static void main(String[] args) {
		InputStream is = null;
		
		try {
			is = new FileInputStream("C://pruebas//test.txt");
			 BufferedInputStream buffInputStr = new BufferedInputStream(is);
			System.out.println((char)is.read());
			if(buffInputStr.markSupported()) {
				is.mark(100);
				System.out.println((char)is.read());
				System.out.println((char)is.read());
				buffInputStr  .reset();
			}
			System.out.println((char)is.read());
			System.out.println((char)is.read());
			System.out.println((char)is.read());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
