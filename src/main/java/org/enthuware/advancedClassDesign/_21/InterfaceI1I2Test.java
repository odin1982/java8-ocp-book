package org.enthuware.advancedClassDesign._21;

import java.io.FileNotFoundException;

public class InterfaceI1I2Test implements I1,I2{

	@Override
	public void m1() throws FileNotFoundException {
		
	}

}

interface I1{
	void m1() throws java.io.IOException;
}

interface I2{
	void m1() throws java.io.FileNotFoundException;
}