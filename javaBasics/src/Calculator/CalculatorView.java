package Calculator;

import java.util.Scanner;

public class CalculatorView {
	
	private Calculator calculator = new Calculator();
	private Scanner scan = new Scanner(System.in);
	private boolean quit = false;
;	
	public void  displayMenu( ) {
		System.out.println("add .... +");
		System.out.println("subtract .... -");
		System.out.println("multiply .... *");
		System.out.println("divide .... /");
		System.out.println("clear .... c");
		System.out.println("result .... r");
		System.out.println("quit .... q");
		System.out.println("Enter your choice: ");
	}
	
	public void handleUserRequest() {
		String command = scan.next();
		double val;
		switch (command) {
		case "+":
				System.out.println("enter value to add: ");
				val = Double.parseDouble(scan.next());
				calculator.add(val);
			break;
		case "-":
			System.out.println("enter value to subtract ");
			val = Double.parseDouble(scan.next());
			calculator.sub(val);
			break;
		case "*":
			System.out.println("enter value to multiply by: ");
			val = Double.parseDouble(scan.next());
			calculator.mul(val);
			break;
		case "/":
			System.out.println("enter value to divide by: ");
			val = Double.parseDouble(scan.next());
			calculator.div(val);
			break;
		case "c":
			calculator.clear();
			break;
		case "r":
			System.out.println("Current result: " + calculator.getResult());
			System.out.println("=========================================");
			break;
		case "q":
			this.quit = true;
			scan.close();
			break;
		default:
			System.out.println(command + " is invalid command!!!");
			break;
		
		}
	}
	
	public void start() {
		while(!quit) {
			displayMenu();
			handleUserRequest();
		}
		System.out.println("Bye...");
	}
	
	

}
