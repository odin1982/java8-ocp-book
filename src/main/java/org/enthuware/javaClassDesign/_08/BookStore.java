package org.enthuware.javaClassDesign._08;

import java.util.HashMap;
import java.util.Map;

class Book{
	private String isbn;
	
	public Book(String isbn) {
		this.isbn = isbn;
	}
	
	public boolean equals(Object o) {
		return ( o instanceof Book && ((Book)o).isbn.equals(this.isbn) );
	}
	
//	public int hashCode() {
//		return super.hashCode();
//	}

//	public int hashCode() {
//		return 100;
//	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
}

public class BookStore {
	Map<Book,Integer> map = new HashMap<Book,Integer>();
	
	public BookStore() {
		Book b = new Book("A111");
		System.out.println(b.hashCode());
		map.put(b,10);
		b = new Book("B222");
		System.out.println(b.hashCode());
		map.put(b, 5);
	}
	
	Integer getNumberOfCopies(Book b) {
		System.out.println(b.hashCode());
		return map.get(b);
	}
	
	public static void main(String[] args) {
		BookStore bs = new BookStore();
		Book b = new Book("A111");
		System.out.println(b.hashCode());
		System.out.println(bs.getNumberOfCopies(b));
	}
}

// Remove the equals() method from Book class
/*
	Si se quita el equals retornaria null, aqui solo se sobreescribio
	el metodo equals, si se quita no se elimina, sigue la implementacion
	de java funcionando.
*/