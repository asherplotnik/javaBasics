package loops;

import java.util.Scanner;

public class Matala1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 1 ,  count = 0;
		double sum = 0;
		while(num >= 0) {
			System.out.print("Enter a number : ");
			num = scan.nextInt();
			if (num >= 0){
				sum = sum + num;
				count++;
			}
		}
		if (count == 0) {
			System.out.println("average : 0" );
		} else {
		System.out.println("average :" + (sum/count) );
		}
		scan.close();
	}
}
