package OOPbasics;

public class Book {
	private String name;
	private Author author;
	private double price;
	private int quantity=0;
	// constructors
	public Book(String name, Author author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public Book(String name, Author author, double price, int quantity) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}
	//methods: getters and setters
	public String getName() {
		return name;
	}
	public Author getAuthor() {
		return author;
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
	// methods: toString "Book[name=?,Author[name=?,email=?,gender=?],price=?,qty=?"
	public String toString() {
		return "Book[name=" + name + "," + author + ",price=" + price + ",qty=" + quantity + "]";
	}
}
