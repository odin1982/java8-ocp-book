package org.ocp.pag290.ej02;

public class CannotSwimException extends Exception{
	public CannotSwimException() {
		super();
	}
	
	public CannotSwimException(Exception e) {
		super(e);
	}
	
	public CannotSwimException(String message) {
		super(message);
	}

}
