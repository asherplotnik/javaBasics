package oop;
import java.util.Scanner;
public class StudentProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Student amir = new Student("amir","Java Basic", 100,100,100);
		amir.print();
		
		scan.close();
	}

}
