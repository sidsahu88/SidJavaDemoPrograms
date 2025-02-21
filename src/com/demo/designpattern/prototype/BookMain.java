package com.demo.designpattern.prototype;

public class BookMain {

	public static void main(String[] args) throws CloneNotSupportedException {

		BookShelf bs = new BookShelf();

		bs.setShelfId(1);
		bs.addBook(4);

		System.out.println(bs);
	
		BookShelf bs1 = (BookShelf) bs.clone();
		bs1.setShelfId(2);
				
		System.out.println(bs1);
		
	}

}