package org.ocp.pag431;

import java.io.Serializable;

public class Animal implements Serializable{
	private static final long serialVersionUID = 2L;
	private transient String name;
	private transient int age = 10;
	private static char type = 'C';
	
	{
		this.age = 14;
	}

	public Animal(String name, int age, char type) {
		this.name = name;
		this.age = age;
		this.type = type;
	}
	
	

}
