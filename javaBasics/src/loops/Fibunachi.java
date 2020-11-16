package loops;

import java.util.Scanner;

public class Fibunachi {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter a number : ");
	int num = scan.nextInt();
	int f1 = 1, f2 = 1, count = 2;
	System.out.print(f1 + " ");
	while (count <= num) {
		System.out.print(f2 + " ");
		f2 = f2 + f1;
		f1 = f2 - f1;
		count++;
	}
	scan.close();
}
}
