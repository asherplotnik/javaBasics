package loops;

import java.util.Scanner;

public class Page33ex15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		int num;
		String pupilName;
		for (int i = 1; i <= 3; i++) {
			System.out.print("Enter a Name : ");
			pupilName = scan.nextLine();
			System.out.print("Enter a Grade : ");
			num = scan.nextInt();
			scan.nextLine();
			if (num > 70) {
				System.out.println("Name: " + pupilName);
				count++;
				sum = sum + num;
			}
		}
		if(count == 0) {
			System.out.println("Average: No Students passed 70");
		} else {
			System.out.println(" Average: " + (sum/count));
		}
		scan.close();
	}

}
