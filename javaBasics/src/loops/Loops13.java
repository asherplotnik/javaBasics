package loops;

import java.util.Scanner;

public class Loops13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = scan.nextInt();
		System.out.print("Enter a digit : ");
		int dig = scan.nextInt();
		int temp = 0, count = 0;
		if (num < 0) {
			num = -num;
		}
		while (num > 0) {
			temp = num % 10;
			num = num / 10;
			if (temp == dig) {
				count++;
			}
		}
		System.out.println(count);
		scan.close();
	}

}
