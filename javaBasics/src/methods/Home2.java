package methods;
import java.util.Scanner;

public class Home2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = scan.nextInt();
		printRow(n,true);
		printRow(n,false);
		printRow(n,true);
		scan.close();
	}
	public static void printRow(int n, boolean rowType) {
		if (rowType) {
			for (int i=0; i<n;i++) {
				System.out.print("*");
			}
			System.out.println();
		}else {
			for (int i=0; i<n-2;i++) {
				System.out.print("*");
				for (int j=0; j<n-2;j++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
		}
		
	}

}
