package basicExercises;
import java.util.Scanner;

public class CheckOddEven {
	
	public static void main(String[] args) {
		int number;
		Scanner userEntry = new Scanner(System.in);
		System.out.print("Specify int number: ");
		number = userEntry.nextInt();
		userEntry.close();
		
		if (number%2 !=0) {
			System.out.println("ODD");
		}
		else {
			System.out.println("EVEN");
		}
		System.out.println("BYE");
	}
}
