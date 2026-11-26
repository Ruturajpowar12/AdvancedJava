package myBook;

public class Book {

    int bookId;
    String bookName;
    double price;

    public Book(int bookId, String bookName, double price) {
        super();
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [bookId=" + bookId + ", bookName=" + bookName
                + ", price=" + price + "]";
    }
}