package basicExercises;
import java.util.Scanner;
/*
 * Computes product of integer values from 1 to N, no exception handling.
 */
public class Product1ToN {

	public static void main(String[] args) {
		// initialize variables
		int n;
		long result=1;
		// create scanner to read user value 
		Scanner readN = new Scanner(System.in);
		System.out.print("This program computes Product from 1 to N, specify N: ");
		// read value
		n=readN.nextInt();
		readN.close();
		// compute
		for (int iterator=1;iterator<=n;iterator++) {
			result*=iterator;
		}
		// print result
		System.out.println("Result equals: "+result);
	}
}
