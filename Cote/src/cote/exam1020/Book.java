package cote.exam1020;

public class Book {
	private String title;
	private String author;
	private int price;
	private String isbn;
	
	
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Book (String title, String author, String isbn) {
		this.title=title;
		this.author = author;
		this.price = 0;
		this.isbn = isbn;
	}
	public Book (String title, String author, String isbn, int price) {
		this.title=title;
		this.author = author;
		this.price = price;
		this.isbn = isbn;
	}
	

}
