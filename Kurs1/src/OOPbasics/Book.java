package OOPbasics;

public class Book {
	private String name;
	private Author[] authors;
	private double price;
	private int quantity=0;
	// constructors
	public Book(String name, Author[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
	}
	public Book(String name, Author[] authors, double price, int quantity) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.quantity = quantity;
	}
	//methods: getters and setters
	public String getName() {
		return name;
	}
	public Author[] getAuthors() {
		return authors;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	// methods: toString "Book[name=?,Authors[name=?,email=?,gender=?]...,price=?,qty=?"
	public String toString() {
		String authorsNames = new String();
		for (int index=0 ; index<authors.length ; index++) {
			authorsNames += authors[index];
			if (index<authors.length-1) authorsNames += ",";
		}
		return "Book[name=" + name + ",authors=" + "{" + authorsNames + "}" + ",price=" + price + ",qty=" + quantity + "]";
	}
	public String getAuthorNames() {
		String authorsNames = new String();
		for (int index=0 ; index<authors.length ; index++) {
			authorsNames += authors[index].getName();
			if (index<authors.length-1) authorsNames += ",";
		}
		return "\"" + authorsNames + "\"";
	}
}
