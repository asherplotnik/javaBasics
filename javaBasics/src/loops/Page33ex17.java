package loops;

import java.util.Scanner;

public class Page33ex17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Count : ");
		int count = scan.nextInt();
		
		int val = 0, max = 0, pos = 0, appear = 0;
		for (int i = 1; i <= count; i++) {
			System.out.print("Enter Value : ");
			val = scan.nextInt();
			if (max == val) {
				appear++;
			}
			if (max < val) {
				appear = 1;
				max = val;
				pos = i;
			}
		}
		System.out.println("Max: " + max + " First index : " + pos + " Appear :" + appear + " times");
		scan.close();
	}

}
