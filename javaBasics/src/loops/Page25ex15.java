package loops;

import java.util.Scanner;

public class Page25ex15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int temp = 0 , val = 0 , phil = 0 , digit = 0;
		System.out.print("Enter a number:");
		val = scan.nextInt();
		temp = val;
		while (val > 0) {
			phil = phil*10;
			digit = val % 10;
			val = val / 10;
			phil = phil + digit;
		}
		System.out.println("oposite number: " + phil);
		if (phil == temp) {
			System.out.println("this number is a philandrom!!!");
		} else {
			System.out.println("syso this number is NOT a philandrom");
		}
		scan.close();
	}

}
