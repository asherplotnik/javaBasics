package cinema;

import java.util.Scanner;

public class CinemaView {
		private Cinema cinema = new Cinema(5,10);
		private Scanner scan = new Scanner(System.in);
		private boolean quit = false;
		
		public void  displayMenu( ) {
			System.out.println("book a seat .... +");
			System.out.println("remove a seat .... -");
			System.out.println("show seats .... s");
			System.out.println("quit .... q");
			System.out.println("Enter your choice: ");
		}
		
		public void handleUserRequest() {
			String command = scan.next();
			int  i;
			int  j;
			String seatName;
			switch (command) {
			case "+":
				System.out.print("Enter name to book: ");
				seatName = scan.next();
				System.out.print("Enter seat row number (1-5): ");
				i = scan.nextInt();
				System.out.print("Enter seat number:(1-10) ");
				j = scan.nextInt();
				if( i>=1 && i <=10 && j>=1 && j<=10 ) {
					cinema.add(seatName,i-1,j-1);
				} else {
					System.out.println("Invald seat number");
				}
				break;
			case "-":
				System.out.print("Enter seat row number: ");
				i = scan.nextInt();
				System.out.print("Enter seat number: ");
				j = scan.nextInt();
				if( i>=1 && i <=10 && j>=1 && j<=10 ) {
					cinema.remove(i-1,j-1);
				} else {
					System.out.println("Invald seat number");
				}
				break;
			case "s":
				cinema.display();
				System.out.println("========================================================");
				break;
			case "q":
					this.quit = true;
					scan.close();
				break;
			default:
				System.out.println("invalid request!");
			}
		}
		
		public void start() {
			while(!quit) {
				displayMenu();
				handleUserRequest();
			}
			System.out.println("Bye...");
		}
		
	public static void main(String[] args) {
		CinemaView view = new CinemaView();
		view.start();
	}

}
