package IOexercises;
import java.util.Scanner;

public class StandardIO {

	public static void main(String[] args){
	
		double number1;
		double number2;
		Scanner odczyt = new Scanner(System.in);
		System.out.print("Podaj liczbę 1: ");
		number1 = odczyt.nextDouble();
		System.out.print("Podaj liczbę 2: ");
		number2 = odczyt.nextDouble();
		odczyt.close();
		System.out.println("Sum: "+(number1+number2));
		System.out.println("Substraction: "+(number1-number2));
		System.out.println("Multiplication: "+(number1*number2));
		System.out.println("Division: "+(number1/number2));
	}
}
