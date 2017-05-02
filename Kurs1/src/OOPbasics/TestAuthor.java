package OOPbasics;

public class TestAuthor {
	
	public static void main(String[] args) {
		Author a1 = new Author("Tolkien", "tolkien@someserver.com", 'm'); 	// constructor test
		System.out.println(a1);												// toString() test
		a1.setEmail("a1@someserver.pl");									// email setter test
		System.out.println("Name: " + a1.getName());						// name getter test
		System.out.println("Email: " + a1.getEmail());						// email getter test
		System.out.println("Gender: " + a1.getGender());					// gender getter test
	}

}
