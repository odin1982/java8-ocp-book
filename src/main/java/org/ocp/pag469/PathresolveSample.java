package org.ocp.pag469;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathresolveSample {
	public static void main(String[] args) {
		Path path1 = Paths.get("/pruebas/subfolder");
		Path path2 = Paths.get("subsubfolder");
		
		System.out.println(path1.resolve(path2));
	}

}
