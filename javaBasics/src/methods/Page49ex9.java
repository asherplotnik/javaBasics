package methods;
import java.util.Scanner;
public class Page49ex9 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int[] arr1 = new int[3];
		Scanner scan = new Scanner(System.in);
		for (int i = 0;i<arr.length ; i++) {
			arr[i] = (int)(Math.random()*50)+1;
		}
		Arrays.printArr(arr);
		for (int i = 0;i<arr1.length ; i++) {
			System.out.println("enter a number: ");
			arr1[i] = scan.nextInt();
		}
		methodA(arr,arr1);
		methodB(arr,arr1);
		scan.close();
	}
	public static void methodA(int[] arr,int []arr1) {
		int index = 0;
		boolean found = false;
		for (int i = 0 ; i< arr.length-arr1.length+1 ; i++) {
			index = i;
			int j=0;
			for ( j=0 ; j < arr1.length ; j++) {
				if (arr[i+j] != arr1[j]) {
					break;
				}
			}
			if (j == arr1.length) {
				found = true;
				break;
			}
		}	
		if (found) {
			System.out.println("Method A - found on position :" + (index + 1));
		} else {
			System.out.println("Method A - Not found");
		}
	}
	public static void methodB(int[] arr,int []arr1) {
		int index = 0;
		int count = 0;
		boolean first = false;
		for (int i = 0 ; i< arr.length ; i++) {
			if (!first) {
				index = i;
			}
			for (int j=count ;j< arr1.length;j++) {
				if (arr[i] == arr1[j]) {
					int temp = arr1[j];
					arr1[j] = arr1[count];
					arr1[count] = temp;
					count++;
					if (!first) 
						first =  true;
					break;
				}
			}
		}	
		
		if (count == arr1.length) {
			System.out.println("Method b - found on position : " + (index + 1));
		} else {
			System.out.println("Method b - Not found");
		}
	}
}
