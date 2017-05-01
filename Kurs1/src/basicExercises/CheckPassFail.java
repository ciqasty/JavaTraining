package basicExercises;
import java.util.Scanner;

public class CheckPassFail {

	public static void main(String[] args) {
		int mark;
		Scanner userEntry = new Scanner(System.in);
		System.out.print("Provide an integer:");
		mark = userEntry.nextInt();
		userEntry.close();
		
		if (mark>=50) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("DONE");
		
	}

}
