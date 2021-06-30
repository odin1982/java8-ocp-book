package org.ocp.pag301;

public class ExampleTwo implements AutoCloseable{

	@Override
	public void close() throws Exception {
		throw new Exception("Cage door does not close");
	}

}
