package sudaJava;

public class BookTask {
private int bookId;
private String title;
private String author;
private double price;
public BookTask(int bookId, String title, String author, double price) {
	this.bookId = bookId;
	this.title = title;
	this.author = author;
	this.price = price;
}
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "BookTask [bookId=" + bookId + ", title=" + title + ", author=" + author + ", price=" + price + "]";
}

}
