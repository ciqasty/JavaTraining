package IOexercises;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

import javax.swing.table.TableStringConverter;


public class FileIO {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter zapis = new PrintWriter("test.txt");
		zapis.write("123");
		zapis.close();
		
		
		File file = new File("test.txt");
		Scanner in = new Scanner(file);
		String zdanie = in.nextLine();
		in.close();
		System.out.println(zdanie);
		
		
	}

}
