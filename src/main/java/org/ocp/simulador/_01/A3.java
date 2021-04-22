package org.ocp.simulador._01;

import java.io.IOException;

public class A3 {
	byte getStatusCode(Object obj) throws NullPointerException{
		if(obj != null) return 127;
		else return -1;
	}
}

class B2 extends A3{
	//overriding method CANNOT throw IOException
	/*
	byte getStatusCode(Object obj) throws IOException{
		if(obj != null) return 127;
		else return -1;
	}
	*/
	
	//overriding method can throw Throwable
	/*
	byte getStatusCode(Object obj) throws Throwable{
		if(obj != null) return 127;
		else return -1;
	}
	*/
	
	//overriding method may choose not to throw any exception
	byte getStatusCode(Object obj){
		if(obj != null) return 127;
		else return -1;
	}
}
