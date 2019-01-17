package ejb_book;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import entities.Book;
import iface.BookStore;
@Stateless(name = "bookStore", mappedName="mappedBookStore")
@Remote(BookStore.class)
public class BookStoreBean implements BookStore {
	Set<String> titles = new HashSet<>();

	@Override
	public boolean addBook(Book newBook) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getBookByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}



}
