package org.enthuware.advancedClassDesign._08;

import java.io.FileNotFoundException;

interface I1{
	void m1() throws java.io.IOException;
}

interface I2{
	void m1() throws java.io.FileNotFoundException;
}

public class TestInterfaceI1I2 implements I1,I2{

	@Override
	public void m1() throws FileNotFoundException {
		
	}
	
}
