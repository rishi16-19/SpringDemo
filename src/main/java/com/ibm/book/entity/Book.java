package com.ibm.book.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Book")
public class Book {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="book_name")
	String bookName;
	
	@Column(name="book_author")
	String bookAuthor;
	
	@Column(name="book_pages")
	int bookPages;
	
	@Column(name="book_price")
	double bookPrice;
	
	@Column(name="book_language")
	String bookLanguage;
	
	@Column(name="book_publisher")
	String bookPublisher;
	
	@Column(name="book_category")
	String bookCategory;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public int getBookPages() {
		return bookPages;
	}

	public void setBookPages(int bookPages) {
		this.bookPages = bookPages;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookLanguage() {
		return bookLanguage;
	}

	public void setBookLanguage(String bookLanguage) {
		this.bookLanguage = bookLanguage;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

	public String getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}

	public Book(int id, String bookName, String bookAuthor, int bookPages, double bookPrice, String bookLanguage,
			String bookPublisher, String bookCategory) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPages = bookPages;
		this.bookPrice = bookPrice;
		this.bookLanguage = bookLanguage;
		this.bookPublisher = bookPublisher;
		this.bookCategory = bookCategory;
	}

	public Book() {
		super();
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPages=" + bookPages
				+ ", bookPrice=" + bookPrice + ", bookLanguage=" + bookLanguage + ", bookPublisher=" + bookPublisher
				+ ", bookCategory=" + bookCategory + "]";
	}
	
	
	
	
	
	

}
