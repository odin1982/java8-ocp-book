package org.ocp.simulador._01;

class TaskBase {
	int getStatusCode(Object obj) throws NullPointerException{
		if(obj != null) return 1;
		else return 0;
	}
}

class ParallelTask extends TaskBase{
//	int getStatusCode(String obj) throws NullPointerException{
//		if(obj != null) return 1;
//		else return 0;
//	}
	
//	long getStatusCode(Object obj) throws NullPointerException{
//		if(obj != null) return 1;
//		else return 0;
//	}
	
//	int getStatusCode(Object obj) throws RuntimeException{
//		if(obj != null) return 1;
//		else return 0;
//	}
	
//	byte getStatusCode(Object obj) throws IllegalArgumentException{
//		if(obj != null) return 1;
//		else return 0;
//	}
}
