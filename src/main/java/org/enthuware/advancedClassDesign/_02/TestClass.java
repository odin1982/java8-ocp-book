package org.enthuware.advancedClassDesign._02;

class TestClass implements T1,T2{	
	@Override
	public void m1() {}
}

interface T1{
	int VALUE = 1;
	void m1();
}

interface T2{
	int VALUE = 3;
	void m1();
}
