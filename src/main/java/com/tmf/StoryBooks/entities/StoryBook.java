package com.tmf.StoryBooks.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity

public class StoryBook {
	@Id
	@SequenceGenerator(
				initialValue = 1,
				allocationSize = 1,
				sequenceName = "book",
				name = "book"
			)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book")
	private long bookId;
	private String title;
	private String author;
	private double price;
	private String publishedDate;
	
	public StoryBook() {}
	
	public StoryBook(long bookId, String title, String author, double price, String publishedDate) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
		this.publishedDate = publishedDate;
	}
	@Override
	public String toString() {
		return "StoryBook [bookId=" + bookId + ", title=" + title + ", author=" + author + ", price=" + price
				+ ", publishedDate=" + publishedDate + "]";
	}
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}
	
}
