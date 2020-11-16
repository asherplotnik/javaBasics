package methods;
import java.util.Scanner;

public class Home3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		short[] arr = new short[5];
		for (int i=0 ; i < 5;i++){
			System.out.print("Enter a number: ");
			arr[i] = scan.nextShort();
		}
		System.out.println(chkAvg(arr));
		short[] arr2 = {5,5,3,2,1};
		System.out.println(chkAvg(arr2));
		scan.close();
	}
	
	public static double chkAvg(short[] arrP) {
		double sum = 0;
		for (int i=0;i<arrP.length;i++) {
			sum += arrP[i];
		}
		return sum/arrP.length;
	}

}
