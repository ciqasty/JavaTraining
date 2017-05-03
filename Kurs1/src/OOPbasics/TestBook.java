package OOPbasics;

public class TestBook {

	public static void main(String[] args) {
		// authors array for further use
		Author[] authors = new Author[2];
		authors[0] = new Author("somename", "somename@gmail.com", 'f');
		authors[1] = new Author("Joh Doe", "JD@serv.com", 'm');
		// book instances, constructor tests
		Book book1 = new Book("sometitle", authors, 50, 20);
		Book book2 = new Book("just some other title", authors, 32.76);
		// getAuthorNames method test
		System.out.println(book1.getAuthorNames());
		System.out.println(book2.getAuthorNames());
		// getters setters tests
		book2.setPrice(33.00);
		book2.setQuantity(90);
		System.out.println(book1.getQuantity());
		System.out.println(book1.getPrice());
		System.out.println(book1.getName());
		System.out.println(book1.getAuthors()[0]);
		System.out.println(book1.getAuthors()[1]);
		// toString test
		System.out.println(book1);
		System.out.println(book2);
	}

}
