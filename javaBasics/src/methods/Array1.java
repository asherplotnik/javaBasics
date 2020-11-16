package methods;

public class Array1 {

	public static void main(String[] args) {
		char[] arr = new char[20];
		int countDig = 0;
		int countLetter = 0;
		for (int i = 0;i<arr.length ; i++) {
			arr[i] = (char)((int)(Math.random()*95)+33);
			if(arr[i] >= '0' && arr[i] <= '9') {
				countDig++;
			} else if (arr[i] >= 'A' && arr[i] <= 'Z' || arr[i] >= 'a' && arr[i] <= 'z'){
				countLetter++;
			}
		}
		Arrays.printArr(arr);
		System.out.println("Digits: "+ countDig + "Letters :" + countLetter + "Rest: " + (arr.length-countDig - countLetter));
	}

}
