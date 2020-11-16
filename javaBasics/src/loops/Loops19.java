package loops;

import java.util.Scanner;

public class Loops19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = scan.nextInt();
		int i = 2;
	    long fact =1;
		while ( i <= num) {
			fact = fact * i;
			i++;
		}
		System.out.print(fact);
		scan.close();
	}

}
