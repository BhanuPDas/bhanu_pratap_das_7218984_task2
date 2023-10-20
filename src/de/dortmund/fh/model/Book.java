package de.dortmund.fh.model;

public class Book {

	private Author author;
	private String title;
	private int numberOfPages;

	public Book() {

	}

	public Book(Author author, String title, int numberOfPages) {

		this.author = author;
		this.title = title;
		this.numberOfPages = numberOfPages;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

}
