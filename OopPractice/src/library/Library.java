package library;

import java.util.ArrayList;
import java.util.List;

import book.Book;

public class Library {
	
//	Write a Java program to create a class called "Library" with a collection of books and methods to add and remove books.
	private List<Book> library = new ArrayList<>();
	
	public void addBook(String title, String author, String ISBN) {
		library.add(new Book(title, author, ISBN));
	}
	//remove with full detail
	public boolean removeBook(String title, String author, String ISBN) {
		library.removeIf(library -> 
			library.getTitle().equalsIgnoreCase(title) && 
			library.getAuthor().equalsIgnoreCase(author) && 
			library.getISBN().equalsIgnoreCase(ISBN));
		return true;
	}
	//Show the list
	public void display() {
		if(!library.isEmpty()) {
			for(Book b : library) {
				System.out.println(b);
			}
		}else {
			System.out.println("List null");
		}
	}
}
