package SecondaryMapConstructorInject;

public class Book {
	Integer bookId;
	String title;
	public Book(int bookId, String title) {
		super();
		this.bookId = bookId;
		this.title = title;
	}
	@Override
	public String toString() {
		return "\nBook [bookId=" + bookId + ", title=" + title + "]";
	}
	
}
