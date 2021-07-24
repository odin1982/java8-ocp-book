package org.ocp.pag408;

import java.io.File;
/**
 * 
 * @author odina
 *	Obtiene un archivo a traves de una ruta padre ya definida, es otra forma de declarar un File
 */
public class ChildPath {
	public static void main(String[] args) {
		File parent = new File("C:\\Users\\odina\\Documents\\eclipse-workspace\\java");
		File child = new File(parent,"java8-ocp-book\\src\\main\\resources\\prueba.txt");
		System.out.println("exist: " + child.exists());
	}
}
