package org.enthuware.javaClassDesign._17;

import java.util.HashMap;
import java.util.Map;

class Book{
	private String title,isbn;
	public boolean equals(Object o) {
		return (o instanceof Book && ((Book)o).isbn.equals(this.isbn));
	}
	
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
	int getNUmberOfCopies(Book b) {
		return map.get(b);
	}
	
	public void addBook(Book b,int numberofcopies) {
		map.put(b, numberofcopies);
	}
}

public class TestClass {
	static BookStore bs = new BookStore();
	
	public static void main(String[] args) {
		Book b = new Book();
		b.setIsbn("111");
		bs.addBook(b, 10);
		System.out.println(bs.getNUmberOfCopies(b));
		
		b = new Book();
		b.setIsbn("111");
		System.out.println(bs.getNUmberOfCopies(b));
	}
}
