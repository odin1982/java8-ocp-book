package org.ocp.pag301;

public class ExampleThree implements AutoCloseable{
	static int COUNT = 0;

	@Override
	public void close(){
		COUNT++;
	}

}
