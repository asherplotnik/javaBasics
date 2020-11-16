package loops;

import java.util.Scanner;

	
public class Loops {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int number1 = scan.nextInt();
		System.out.print("Enter first number : ");
		int number2 = scan.nextInt();
		int temp = number1;
		if (number1 > number2) {
			number1 = number2;
			number2 = temp;
		}
		while (number1 <= number2) {
			System.out.println(number1);
			number1++;
		}
		scan.close();
	}

}
