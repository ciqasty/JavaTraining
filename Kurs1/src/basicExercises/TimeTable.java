package basicExercises;

public class TimeTable {

	public static void main(String[] args) {
		for(int row=1;row<=11;row++) {
			for(int col=1;col<=11;col++) {
				if (row==1) {
					if (col==1) System.out.printf("%2s","*");
					else if (col==2) System.out.print(" |");
					else {
						System.out.printf("%3d",col-2);
					}
				}
				else if (row==2) {
					if (col<3) System.out.print("--");
					else System.out.print("---");
				}
				else {
					if (col==1) System.out.printf("%2d",row-2);
					else if (col==2) System.out.print(" |");
					else System.out.printf("%3d",(col-2)*(row-2));
				}
			}
			System.out.println();
		}

	}

}
