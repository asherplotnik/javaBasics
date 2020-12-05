package myExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleTest {

	public static void main(String[] args) {
		Triangle t1 = null;
		Scanner scan = new Scanner(System.in);
		boolean isATriangle = false;
		while (!isATriangle) {
			try {
				System.out.print("Enter A: ");
				int a = scan.nextInt();
				System.out.print("Enter B: ");
				int b = scan.nextInt();
				System.out.print("Enter C: ");
				int c = scan.nextInt();
				t1 = new Triangle(a, b, c);
				isATriangle = true;
			} 
			
			catch (InputMismatchException ex) {
				scan.next();
				System.out.println("type miss match");
			}
			
			catch (NotATriangleException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println(t1);
		scan.close();
	}

}
