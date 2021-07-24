package org.ocp.pag408;
/**
 * 
 * @author odina
 * Obtiene el separador dependiendo en el sistema operativo en el que estes
 */
public class FileSeparator {
	public static void main(String[] args) {
		System.out.println(System.getProperty("file.separator"));
		System.out.println(java.io.File.separator);
	}
}
