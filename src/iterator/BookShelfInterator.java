package iterator;


import iterator.Iterator.Iterater;

public class BookShelfInterator implements Iterater {
	private BookShelf bookShelf;
	private int index;

	public BookShelfInterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;

	}

	@Override
	public boolean hasNext() {
		if (index < bookShelf.getLength()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object next() {
		Book book=bookShelf.getBookAt(index);
		index++;
		return book;
	}

}
