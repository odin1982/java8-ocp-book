package org.ocp.pag302;

public class JammedTurkeyCage3 implements AutoCloseable{

	@Override
	public void close() throws IllegalStateException {
		throw new IllegalStateException("Cage door does not close");
	}
	
	public static void main(String[] args) {
		try(JammedTurkeyCage3 t = new JammedTurkeyCage3()){
			throw new RuntimeException("turkeys ran off");
		}catch(IllegalStateException e) {
			System.out.println("caught: " + e.getMessage());
		}
	}

}
