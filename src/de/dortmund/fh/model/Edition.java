package de.dortmund.fh.model;

import java.util.List;

public class Edition {

	private Author author;
	private List<Book> book;
	private double price;
	private int number;
	private int year;
	private String nameOfEditorHouse;
	private int publishedNumber;

	public Edition() {

	}

	public Edition(Author author, List<Book> book, double price, int number, int year, String nameOfEditorHouse,
			int publishedNumber) {

		this.author = author;
		this.book = book;
		this.price = price;
		this.number = number;
		this.year = year;
		this.nameOfEditorHouse = nameOfEditorHouse;
		this.publishedNumber = publishedNumber;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getNameOfEditorHouse() {
		return nameOfEditorHouse;
	}

	public void setNameOfEditorHouse(String nameOfEditorHouse) {
		this.nameOfEditorHouse = nameOfEditorHouse;
	}

	public int getPublishedNumber() {
		return publishedNumber;
	}

	public void setPublishedNumber(int publishedNumber) {
		this.publishedNumber = publishedNumber;
	}

}
