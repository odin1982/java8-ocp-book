package org.ocp.pag301;

public class StuckTurkeyCage implements AutoCloseable{

	@Override
	public void close() throws Exception{
		throw new Exception("Cage door does not close");
	}
	
	public static void main(String[] args) {
		try(StuckTurkeyCage t = new StuckTurkeyCage()){//DOES NOT COMPILE, checked exception need to handled
			System.out.println("put turkeys in");
		}
	}

}
