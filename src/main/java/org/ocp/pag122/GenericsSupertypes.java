package org.ocp.pag122;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//Este es un caso extraño ya que FileNotFoundException es un IOException
public class GenericsSupertypes {
	public static void main(String[] args) {
		List<? super IOException> exceptions =  new ArrayList<Exception>();
		//exceptions.add(new Exception());//DOES NOT COMPILE
		exceptions.add(new IOException());
		exceptions.add(new FileNotFoundException());
	}
}
