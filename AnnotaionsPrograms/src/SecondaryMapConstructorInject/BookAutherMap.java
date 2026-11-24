package SecondaryMapConstructorInject;

import java.util.Map;

public class BookAutherMap {
	 Map<Book,Author> bookDtls;

	 public BookAutherMap(Map<Book, Author> bookDtls) {
		super();
		this.bookDtls = bookDtls;
	 }

	 @Override
	 public String toString() {
		return "BookAutherMap [bookDtls=" + bookDtls + "]";
	 }
	 
	 
}
