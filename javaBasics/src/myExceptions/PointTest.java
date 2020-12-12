package myExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PointTest {
	public static void main(String[] args) {
		Point p1 = new Point();
		
		boolean inputCheck = false;
		boolean xEnteredAsNumber = false;
		boolean yEnteredAsNumber = false;
		Scanner scan = new Scanner(System.in);
		int inX = 0;
		int inY = 0;
		while (!inputCheck) {
			inputCheck = true;
			try {
				if (!xEnteredAsNumber) {
					System.out.print("Enter X: ");
					inX = scan.nextInt();
					xEnteredAsNumber = true;
					p1.setX(inX);
				}
			}

			catch (OutOfBoundPointException e) {
				if (inX < Point.MIN) {
					inX = Point.MIN;
					System.out.println("X out of range set to minimum 0");
				}
				if (inX > Point.MAX) {
					inX = Point.MAX;
					System.out.println("X out of range set to minimum 100");
				}

				try {
					p1.setX(inX);
				} catch (Exception ex) {
					System.out.println(ex.getMessage());
				}

			}
			catch (InputMismatchException ex) {
				System.out.println("input miss smatch: ");
				inputCheck = false;
				scan.next();
				xEnteredAsNumber = false;
			}
			try {
				if (!yEnteredAsNumber) {
					System.out.print("Enter Y: ");
					inY = scan.nextInt();
					yEnteredAsNumber = true;
					p1.setY(inY);
				}
			} 
			
			catch (OutOfBoundPointException e) {

				if (inY < Point.MIN) {
					inY = Point.MIN;
					System.out.println("Y out of range set to minimum 0");

				}
				if (inY > Point.MAX) {
					inY = Point.MAX;
					System.out.println("Y out of range set to minimum 100");
				}
				try {

					p1.setY(inY);
				} catch (Exception ex) {
					System.out.println(ex.getMessage());
				}

			}
			catch (InputMismatchException ex) {
				System.out.println("input miss smatch: ");
				inputCheck = false;
				scan.next();
				yEnteredAsNumber = false;
			}

		}

		scan.close();
		System.out.println("p1:" + p1);
	}
	

}
