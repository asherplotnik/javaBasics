package oop;

import java.util.Scanner;

public class ProgramCar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Car[] cars = new Car[3];
		for (int i=0 ; i < 3 ; i++) {
			System.out.print("Enter Car "+ (i+1) + "  brand: ");
			String brand = scan.next();
			System.out.print("Enter Car "+ (i+1) + "  color: ");
			String color = scan.next();
			cars[i] = new Car(brand,color);
		}
		scan.close();
	}

}
