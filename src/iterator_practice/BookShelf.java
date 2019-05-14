package iterator_practice;

import java.util.ArrayList;

import iterator.Iterator.Iterater;

public class BookShelf implements Aggregate {
	//private Book[] books;
	private ArrayList books;
	private int last = 0;

	public BookShelf(int initialSize) {
		this.books = new ArrayList(initialSize);
	}

	public Book getBookAt(int index) {
		//return books[index];
		return (Book) books.get(index);
	}

	public void appendBook(Book book) {
		//this.books[last] = book;
		books.add(book);
		last++;
	}

	public int getLength() {
		return last;
	}

	public Iterater iterator() {
		return new BookShelfInterator(this);

	}

}
