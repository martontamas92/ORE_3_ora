package iface;

import java.util.List;

import entities.Book;

public interface BookStore {

	boolean addBook(Book newBook);
	List<Book> getAllBooks();
	Book getBookByTitle(String title);
}
