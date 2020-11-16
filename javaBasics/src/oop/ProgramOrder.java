package oop;

import java.util.Scanner;

public class ProgramOrder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Order[] orders = new Order[3];
		for (int i=0 ; i < 3 ; i++) {
			System.out.print("Enter Order "+ (i+1) + "  item: ");
			String item = scan.next();
			System.out.print("Enter Order "+ (i+1) + "  price: ");
			double price = scan.nextDouble();
			System.out.print("Enter Order "+ (i+1) + "  quantity: ");
			int quantity = scan.nextInt();
			orders[i] = new Order(item,price,quantity);
			orders[i].printOrder();
		}
		scan.close();
	}
	

}
