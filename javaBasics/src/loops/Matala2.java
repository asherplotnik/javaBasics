package loops;

import java.util.Scanner;

public class Matala2 {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter a Number : ");
			int num = scan.nextInt();
			int temp = num;
			int div  = 2;
			boolean isPrime  = true;
			while(num > 1 && isPrime) {
				if (num % div == 0) {
					num = num / div;
					if (num != 1) {
						isPrime = false;
					}
				} else {
					div++;
				}
			}
			if (isPrime && temp > 1) {
				System.out.println(temp  + " is a prime");
			} else {
				System.out.println(temp  + " is NOT a prime");

			}
		scan.close();
	}

}
