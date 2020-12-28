package matalaApiAsherPlotnik;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Program {
	private static  Scanner scan = new Scanner(System.in);
	static boolean working = true;
	public static void main(String[] args) {
		OrderSystem os = new OrderSystem();
		
		while (working) {
			menu(os);
		}
			
	}
	
	
	public static Order getOrderFromUser() throws Exception {
		Order ord=null;
		System.out.print("Enter order description: ");
		String description = scan.nextLine();
		System.out.print("Is the order important: yes/no ");
		boolean important = false;
		String chk = scan.nextLine();
		if (chk.equalsIgnoreCase("yes")) {
			important = true;
		} else if (!chk.equalsIgnoreCase("no")) {
			System.out.println("Wrong input - default input set to NO");
		}
		
		System.out.print("Enter expiration time:  hh:mm:ss   ");
		String time = scan.nextLine();
		System.out.print("Enter expiration date:  yyyy-MM-dd   ");
		String date = scan.nextLine();
		LocalDateTime exp  = LocalDateTime.of(LocalDate.parse(date), LocalTime.parse(time));
		ord = new Order(exp, description,important );
		return ord;
	}
	
	public static void menu(OrderSystem os) {
		System.out.println("Welcome to order system Menu !!!");
		System.out.println("1) Add new order ...... : a");
		System.out.println("2) display orders ..... : b");
		System.out.println("3) Exit system ........ : x");
		System.out.println("Enter your choice here: ");
		String s = scan.nextLine();
		switch(s) {
			case "a":
				try {
					os.addOrder(getOrderFromUser());
				} catch (invalidOrderExcepition ex) {
					System.out.println(ex.getMessage());
				} catch (Exception e) {
					System.out.println();
					System.out.println("ERROR order faild to add due to invalid input");
					System.out.println();
				}
				break;
			case "b": 
				os.printOrders();
				break;
			case "x":
				doQuit(os);
				break;
			default: 
				System.out.println("No such option exists!!! try again.");
		}
	}
	
	public static void doQuit(OrderSystem os) {
		os.getOrderTask().interrupt();
		scan.close();
		working = false;
		
	}

}
