package org.ocp.pag301;

public class ExampleOne implements AutoCloseable{

	@Override
	public void close() throws Exception {
		throw new IllegalStateException("Cage door does not close");
	}

}
