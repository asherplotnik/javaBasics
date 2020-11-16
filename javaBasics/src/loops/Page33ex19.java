package loops;

import java.util.Scanner;

public class Page33ex19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = scan.nextInt();
		int f1 = 1, f2 = 1;
		while (f2 <= num) {
			f2 = f2 + f1;
			f1 = f2 - f1;
		}
		
			System.out.print("output: " + f2);
		
		scan.close();
	}
}
