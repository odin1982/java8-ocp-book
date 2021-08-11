package org.ocp.pag469;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathNormalizeSample {
	public static void main(String[] args) {
		Path path3 = Paths.get("C:\\documentacion");
		Path path4 = Paths.get("C:\\pruebas\\subfolder");
		
		Path relativePath = path3.relativize(path4);// ../pruebas/subfolder
		System.out.println("relativePath: " + relativePath);
		System.out.println(path3.resolve(relativePath));
		System.out.println("normalizePath: " + path3.resolve(relativePath).normalize());
	}
}
