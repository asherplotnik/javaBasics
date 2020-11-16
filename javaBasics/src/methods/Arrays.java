package methods;

public class Arrays {

	public static void main(String[] args) {
		int[] numbers =  {1,2};
		
		changeArray(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
		}
	}

	public static void changeArray ( int[] parameter) {
		parameter[0] = 9;
		parameter[1] = 8;
	}
	
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void printArr(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
