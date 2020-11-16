package methods;
import java.util.Scanner;

public class Home6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = (int)(Math.random()*10)+1;
		System.out.println(num);
		int count = 1;
		boolean found  = false;
		while (!found || count > 10) {
			System.out.print("Guess a number from 1 to 10 : ");
			int guess = scan.nextInt();
			if (guess == num) {
				found = true;
			}else {
				count++;
			}
		}
		if  (found) {
			System.out.println("Found after " + count + " times");
			System.out.println("Your score is : " + (1100 - count*100));
		}
		scan.close();
	}

}
