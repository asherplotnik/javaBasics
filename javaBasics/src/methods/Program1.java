package methods;
import java.util.Scanner;
public class Program1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = scan.nextInt();
		
		System.out.println("factorail :" + fact(num));
		System.out.println("isPrime :" + chkPrime(num));
		scan.close();
		
		for( int i = 0; i<100000;i++) {
			if (chkPrime(i)) {
				System.out.println(i);
			}
		}
	}
	
	
	public static long fact(int num) {
		long fact = 1;
		for (int i = 2; i<= num;i++) {
			fact = fact * i;
		}
		return fact;
	}
	
	public static boolean chkPrime(int num) {
		int temp = num;
		int div  = 2;
		boolean isPrime  = true;
		while(num > 1 && isPrime) {
			if (num % div == 0) {
				num = num / div;
				if (num != 1) {
					isPrime = false;
				}
			} else {
				div++;
			}
		}
		if (temp == 1) {
			return false;
		}
		return isPrime;
	}
	

}
