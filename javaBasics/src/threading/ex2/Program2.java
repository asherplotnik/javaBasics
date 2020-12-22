package threading.ex2;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) throws InterruptedException {
		try(Scanner scan = new Scanner(System.in);){
			System.out.println("Welcome to my fuel station !!!");
			System.out.println("Enter CC number: ");
			long cc = scan.nextLong();
			Person person = new Person(cc);
			Thread t1 = new Thread(new CheckApproval(person),"t1");
			t1.start();
			System.out.println("Enter ID: ");
			person.setId(scan.nextInt());
			System.out.println("Enter Name: ");
			person.setName(scan.nextLine());
			scan.nextLine();
			while (person.getApproved() == 0) {
				Thread.sleep(1000);
				System.out.println("Wating Approval ...");
			}
			if (person.getApproved() == 1 ) {
				System.out.println("APPROVED!!!");				
			}else {
				System.out.println("FAILED!!!");
			}
			System.out.println();

		}
		
	}

}
