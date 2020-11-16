package loops;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter N : ");
		int num = scan.nextInt();
		int pow = 1;
		for (int i = 1; i <= num; i++) {
				pow = 2 * pow ;
		}
		System.out.println(pow);
		scan.close();
	}

}
