package methods;

public class Page49ex10 {
	public static void main(String[] args) {
		char[] arr = new char[50];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (char) ((Math.random() * 95) + 33);
		}
		Arrays.printArr(arr);

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			boolean found = false;
			for (int n = 0; n < i; n++) {
				if (arr[i] == arr[n]) {
					found = true;
					break;
				}
			}
			if (!found) {
				for (int j = i + 1; j < arr.length - 1; j++) {
					if (arr[i] == arr[j]) {
						count++;
					}
				}
				if (count == 1) {
					// System.out.println(arr[i] + " appear 1 time.");

				} else {
					System.out.println(arr[i] + " appear " + count + " times.");
				}
			}
		}
	}
}
