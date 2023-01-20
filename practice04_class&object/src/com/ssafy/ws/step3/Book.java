package com.ssafy.ws.step3;

public class Book {
	String isbn;
	String title;
	String author;
	String publisher;
	int price;
	String desc;
	
	public Book() {
		this("None", "None", "None", "None", 0, "None");
	}
	
	public Book(String isbn, String title, String author, String publisher, int price, String desc) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;
	}
	
	public String toString() {
		return isbn+"\t|"+title+"\t|"+author+"\t|"+publisher+"\t|"+price+"\t|"+desc;
	}
	
}

