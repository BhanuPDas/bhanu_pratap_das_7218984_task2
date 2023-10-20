package de.dortmund.fh.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import de.dortmund.fh.model.Author;
import de.dortmund.fh.model.Book;
import de.dortmund.fh.model.Edition;

public class ShowBooks {

	public static void main(String[] args) {
		// Create Data records
		Author author = new Author("AuthorTest1", "AuthorSurnameTest1");
		Book book1 = new Book(author, "Title1", 10);
		Book book2 = new Book(author, "Title2", 20);
		Book book3 = new Book(author, "Title3", 30);
		List<Book> bookList = new ArrayList<>();
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		Edition edition = new Edition();
		edition.setAuthor(author);
		edition.setBook(bookList);
		edition.setNameOfEditorHouse("Editor1");
		edition.setNumber(1);
		edition.setPrice(200.50);
		edition.setPublishedNumber(1);
		edition.setYear(2023);

		// Display books for exact Editor house
		System.out.println("Please enter the name of Editior House");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		if (edition.getNameOfEditorHouse().equalsIgnoreCase(name)) {
			for (Book b : edition.getBook()) {
				System.out.println("Author First name:" + b.getAuthor().getName());
				System.out.println("Author Surname name:" + b.getAuthor().getSurname());
				System.out.println("Title:" + b.getTitle());
				System.out.println("Number of Pages:" + b.getNumberOfPages());
				System.out.println("\n");
			}
		} else {
			System.out.println("Name of Editior House didn't match");
		}
		scan.close();
	}

}
