package oopPractice;

public class Book {

	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	
	public Book(String name, Author author, double price, int qtyInStock) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}

	public Book(String name, Author author, double price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return name+" by "+author;
	}
	
	public String getAuthorName(){
		return this.author.getName();
	}
	
	public String getAuthorEmail(){
		return this.author.getEmail();
	}
	
	public char getAuthorGender(){
		return this.author.getGender();
	}
}
