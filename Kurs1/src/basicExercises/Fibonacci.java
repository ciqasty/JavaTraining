package basicExercises;
import java.util.Scanner;
/*
 * Displays first N Fibonacci numbers and computes average, N specified by user.
 */
public class Fibonacci {

	public static void main(String[] args) {
		int userN;
		Scanner readN = new Scanner(System.in);
		System.out.print("Specify N numbers to calculate Fibonacci: ");
		userN = readN.nextInt();
		readN.close();
		if (userN==1) System.out.println("N = 1, F1 = 1, AVG = 1");
		if (userN==2) System.out.println("N = 2, F1 = F2 = 1, AVG = 1");
		if (userN>2) {
			int fn;
			int n=3;
			int fnMinus1=1;
			int fnMinus2=1;
			int sum=fnMinus1+fnMinus2;
			double average;
			
			System.out.println("The first "+userN+" Fibonacci numbers are:");
			System.out.print("1 1 ");
			while(n <= userN) {
				fn = fnMinus1+fnMinus2;
				sum+=fn;
				System.out.print(fn);
				System.out.print(' ');
				n++;
				fnMinus2=fnMinus1;
				fnMinus1=fn;
			}
			average=(double)sum/userN;
			System.out.println("The average is: "+average);
		}
	}

}
