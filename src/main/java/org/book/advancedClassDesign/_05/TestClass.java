package org.book.advancedClassDesign._05;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Odin Araujo Barragan
 * Revisar reglas de los metodos equals y hashcode que dice que si un metodo es igual a otro debe tener el 
 * mismo hascode. Aqui no se esta sobreescribiendo el método hashCode y cada vez que se crea el objeto Book
 * tiene diferente hascode a pesar de ser iguales.
 */

class Book{
	private String title, isbn;
	
	public boolean equals(Object o) {
		return (o instanceof Book && ((Book)o).isbn.equals(this.isbn));
	}

	/*
	public int hashCode() {
		return isbn.hashCode()*5;
	}
	*/
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
}

class BookStore{
	Map<Book,Integer> map = new HashMap<Book,Integer>();
	
	int getNumberOfCopies(Book b) {
		return map.get(b);
	}
	
	public void addBook(Book b, int numberOfCopies) {
		map.put(b,numberOfCopies);
	}
	
}

public class TestClass {
	static BookStore bs = new BookStore();
	
	public static void main(String[] args) {
		Book b = new Book(); b.setIsbn("111");
		System.out.println("b[hashCode]: " + b.hashCode());
		bs.addBook(b, 10);
		System.out.println(bs.getNumberOfCopies(b));
		
		b= new Book(); b.setIsbn("111");
		System.out.println("b[hashCode]: " + b.hashCode());
		System.out.println(bs.getNumberOfCopies(b));
	}
}
