package loops;

import java.util.Scanner;

public class Loops2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = scan.nextInt();
		while (num > 9  || num < - 9) {
			num = num / 10;
		}
		System.out.println(num);
		scan.close();
	}
}
