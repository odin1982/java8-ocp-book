package org.ocp.pag483;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.UserPrincipal;

public class FilesOwnerShip {
	public static void main(String[] args) {
		try {
			
			//read owner of file
			Path path = Paths.get("/pruebas/a1.txt");
			System.out.println(Files.getOwner(path).getName());
			
			//change owner of file
			UserPrincipal owner = path.getFileSystem()
								.getUserPrincipalLookupService()
								.lookupPrincipalByName("odin");
			
			Files.setOwner(path, owner);
			
			//Output the updated owner information
			System.out.println(Files.getOwner(path).getName());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
