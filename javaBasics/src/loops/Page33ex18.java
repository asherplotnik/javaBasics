package loops;

import java.util.Scanner;

public class Page33ex18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int amount = 0;
		while (amount <= 1) {
			System.out.print("Enter a number bigger than one : ");
			amount = scan.nextInt();
		}
		int num = 0;
		int max = 0;
		int maxIndex = 1;
		int secondMax = 0;
		int secondMaxIndex = 1;
		for (int i = 1; i <= amount; i++) {
			System.out.print("Enter a number : ");
			num = scan.nextInt();
			if (i == 1) {
				max = num;
				secondMax = num;
			}
			if (max < num ) {
				if (secondMax < max) {
					secondMax = max;
					secondMaxIndex = maxIndex;
				}
				max = num;
				maxIndex = i;
			}
			if (secondMax <= num && num < max) {
				secondMax = num;
				secondMaxIndex = i;
			}

		}
		if (secondMax != max){
			System.out.print("second maximum is: " + secondMax + " his index is : " + secondMaxIndex);
		} else {
			System.out.print("wrong input");
		}
		scan.close();
	}

}
