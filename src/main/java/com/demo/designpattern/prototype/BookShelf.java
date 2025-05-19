package com.demo.designpattern.prototype;

import java.util.ArrayList;

public class BookShelf implements Cloneable {

	private int shelfId;
	private ArrayList<Book> books = new ArrayList<Book>();

	public int getShelfId() {
		return shelfId;
	}

	public void setShelfId(int shelfId) {
		this.shelfId = shelfId;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	public void addBook(int n) {

		for (int i = 1; i <= n; i++) {
			Book b = new Book();
			b.setBookId(i);
			b.setBookName("Book " + i);
			b.setBookAuthor("Author " + i);
			books.add(b);
		}

	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "BookShelf [shelfId=" + shelfId + ", books=" + books + "]";
	}

}
