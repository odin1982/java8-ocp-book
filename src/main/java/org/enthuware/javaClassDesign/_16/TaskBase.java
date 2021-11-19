package org.enthuware.javaClassDesign._16;

/*
 * a) Overriding method can return long instead of int
 * 		No se puede
 * 
 * b) Overriding method can take String as a parameter
 * 		seria un overloading si se hace esto
 * 
 * c) Overriding method  can throw any RuntimeException
 * 
 * d) Overriding method may declare the return type as byte
 * 		No se rompe la regla del overriding si fuera un objeto si podria considerarse una subclase
 * 	
 * */
public class TaskBase {
	int getStatusCode(Object obj) throws NullPointerException{
		if(obj != null) return 1;
		else return 0;
	}
}

class ParallelTask extends TaskBase{

////a)
//	@Override
//	long getStatusCode(Object obj) throws NullPointerException {
//		return super.getStatusCode(obj);
//	}
	
////b)
//	@Override
//	int getStatusCode(String obj) throws NullPointerException {
//		return super.getStatusCode(obj);
//	}

////c)
//	@Override
//	int getStatusCode(Object obj) throws RuntimeException {
//		return super.getStatusCode(obj);
//	}

////d)
//	@Override
//	byte getStatusCode(Object obj) throws RuntimeException {
//		return super.getStatusCode(obj);
//	}
	
}
