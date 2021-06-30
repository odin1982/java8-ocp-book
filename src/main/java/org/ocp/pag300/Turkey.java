package org.ocp.pag300;

public class Turkey {
	public static void main(String[] args) {
		try(Turkey t = new Turkey()){//DOES NOT COMPILE Turkey not implement autoclosable interface
			System.out.println(t);
		}
	}

}
