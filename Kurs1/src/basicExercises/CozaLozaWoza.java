package basicExercises;
/*
 * PRints numbers from 1 to 110, 11 numbers per line, places Coza instead of numbers that are multipliers of 3,
 * Loza if multipliers of 5, Wozaa if multipliers fo 7
 */
public class CozaLozaWoza {

	public static void main(String[] args) {
		// set boundaries
		int lowerbound = 1;
		int upperbound = 110;
		// for loop
		for (int iterator=lowerbound;iterator<=upperbound;iterator++) {
			
			if (iterator%3==0) { 							// check if criteria met to print Coza
				System.out.print("Coza");
			} else if (iterator%5==0) {						// check if criteria met to print Loza
				System.out.print("Loza");
			} else if (iterator%7==0) {						// check if criteria met to print Woza
				System.out.print("Woza");				
			} else System.out.print(iterator);				// no criteria met, so print number
			if (iterator%11==0) System.out.println(); 		// if it is 11 number then print new line, else print space
			else System.out.print(' ');
		}
	}
}
