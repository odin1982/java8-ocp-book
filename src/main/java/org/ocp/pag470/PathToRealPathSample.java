package org.ocp.pag470;

import java.io.IOException;
import java.nio.file.Paths;

public class PathToRealPathSample {
	public static void main(String[] args) {
		try {
			System.out.println(Paths.get("/pruebas/a1.txt").toRealPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
