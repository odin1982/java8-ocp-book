package org.book.advancedClassDesign._12;

import java.util.ArrayList;

public class IsItFurry {
	static class Chipmunk{}
	public static void main(String[] args) {
		Chipmunk c = new Chipmunk();
		ArrayList<Chipmunk> l = new ArrayList<>();
		Runnable r = new Thread();
		int result = 0;
		if(c instanceof Chipmunk) result += 1;
		if(l instanceof Chipmunk) result += 2;
		if(r instanceof Chipmunk) result += 4;
	}
}

//Nota: l no tiene ninguna relacion con Chipmunk
// r no marca error ya que es una interface y puede ser implementada en cualquier objeto