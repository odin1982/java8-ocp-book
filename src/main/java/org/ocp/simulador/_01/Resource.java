package org.ocp.simulador._01;

public class Resource {
	private String data = "DATA";
	
	String getData() {
		return data;
	}
	
	void setData(String data) {
		this.data = data == null ? "" : data;
	}
	
	boolean equals(Resource r) {
		return(r != null && r.getData().equals(this.getData()));
	}
	
	/*
	public static void main(String[] args) {
		Resource r1 = new Resource();
		Resource r2 = new Resource();
		System.out.println("Son iguales con atributo data igual: " + r1.equals(r2));
	}
	*/
	
	/*
	public static void main(String[] args) {
		Resource r1 = new Resource();
		r1.data = "ALPHA";
		Resource r2 = new Resource();
		System.out.println("Son iguales con atributo data diferente: " + r1.equals(r2));
	}
	*/
	
	/*
	public static void main(String[] args) {
		boolean equals = new Resource().equals(new Resource());
		System.out.println(equals);
	}
	*/
	
	public static void main(String[] args) {
		new Resource().equals(new Object());
	}

}
