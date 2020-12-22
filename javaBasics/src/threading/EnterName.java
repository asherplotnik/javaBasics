package threading;

import java.util.Scanner;

public class EnterName {

	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable(5,1);
		System.out.print("Enter A name please: ");
		Thread t1 = new Thread(myRunnable,"t1");
		t1.start();
		Scanner scan = new Scanner(System.in);
		System.out.println(scan.next());
		t1.interrupt();
		scan.close();
	}
	
}
