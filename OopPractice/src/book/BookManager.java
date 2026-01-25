package book;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
	private List<Book> books = new ArrayList<>();
	
	//Add new book
	public void addBook(String title, String author, String iSBN) {
		books.add(new Book(title, author, iSBN));
	}
	
	//Remove if title && author
	public boolean removeBook(String title, String author) {
		books.removeIf(books ->
			books.getTitle().equalsIgnoreCase(title) &&
			books.getAuthor().equalsIgnoreCase(author));
		return true;
	}
	//Remove if title
	public boolean removeBookByTitle(String title) {
		books.removeIf(books ->
			books.getTitle().equalsIgnoreCase(title));
		return true;
	}
	//Remove if author
	public boolean removeBookByAuthor(String author) {
		books.removeIf(books ->
			books.getTitle().equalsIgnoreCase(author));
		return true;
	}
	public void listBook() {
		for (Book b : books) {
			System.out.println(b);
		}
	}
	
}
