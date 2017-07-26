package libraryprogram;

import java.io.Serializable;

public class Book implements Serializable { // convert its state to a byte
											// stream so that the byte stream
											// can be reverted back into a copy
											// of the object.

	private int productNumber;
	private String title, author;

	public Book() {
		productNumber = 0;
		title = null;
		author = null;
	}

	public Book(int productNumber, String title, String author) {
		this.productNumber = productNumber;
		this.title = title;
		this.author = author;

	}

	public String toString() {
		return "\nTitle: " + title + "\nAuthor: " + author + "\nProductNumber: " + productNumber + "\n";
	}

}
