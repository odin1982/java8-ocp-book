package org.book.advancedClassDesign._19;

import java.io.IOException;

public class InterfaceI1I2AnotherSample implements I1,I2{

	@Override
	public void m1() throws IOException {
		// TODO Auto-generated method stub
		
	}
	
//	@Override
//	public void m1() throws SQLException {
//		// TODO Auto-generated method stub
//		
//	}

}

interface I1{
	 void m1() throws java.io.IOException;
}

interface I2{
	void m1() throws java.sql.SQLException;
}