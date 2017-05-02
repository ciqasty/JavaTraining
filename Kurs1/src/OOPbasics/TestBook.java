package OOPbasics;

public class TestBook {

	public static void main(String[] args) {
		// author instance for further use
		Author dummya = new Author("somename", "somename@gmail.com", 'f');
		System.out.println(dummya);
		// constructor and toString test
		Book book1 = new Book("Crazy title", dummya, 99.99, 100);
		System.out.println(book1);
		// test setters and getters
		book1.setPrice(87.70);
		book1.setQuantity(20);
		System.out.println("Name: " + book1.getName());
		System.out.println("Price: " + book1.getPrice());
		System.out.println("Quantity: " + book1.getQuantity());
		System.out.println("Author: " + book1.getAuthor());
		System.out.println("Authors name: " + book1.getAuthor().getName());
		System.out.println("Authors email: " + book1.getAuthor().getEmail());
		// anonymous instance of author used in book constructor
		Book book2 = new Book("Just some other title", new Author("John", "John@example.com", 'f'), 55.30);
		System.out.println(book2);
	}

}
