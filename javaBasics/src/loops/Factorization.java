package loops;

import java.util.Scanner;

public class Factorization {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = scan.nextInt();
		int div  = 2;
		System.out.print(" 1");
		while(num > 1) {
			if (num % div == 0) {
				num = num / div;
				System.out.print(" " + div);
			} else {
				div++;
			}
		}
		scan.close();
	}

}
