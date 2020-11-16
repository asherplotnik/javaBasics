package loops;

import java.util.Scanner;

public class Matala3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first Number : ");
		int num1 = scan.nextInt();
		System.out.print("Enter second Number : ");
		int num2 = scan.nextInt();
		int temp = 0;
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		int num = num1;
		while ( num <= num2) {
			temp = num;
			int div = 2;
			boolean isPrime = true;
			while (num > 1 && isPrime) {
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
				System.out.println(temp + " ");
			}
			num = temp;
			num++;
		}
		scan.close();
	}

}
