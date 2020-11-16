package loops;
import java.util.Scanner;
public class Page25ex5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		System.out.print("Enter a number:");
		int val = scan.nextInt();
		while( val != -99) {
			sum = sum+ val;
			System.out.print("Enter a number:");
			val = scan.nextInt();
		}
		System.out.println(sum);
		
		scan.close();
	}

}
