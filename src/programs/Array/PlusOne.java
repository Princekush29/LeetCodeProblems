package programs.Array;

import java.util.Arrays;

public class PlusOne {
	public static void main(String[] args) {
		int arr[] = { 1, 9, 9 }; // 100
		// System.out.println(plusOne(arr));
		int[] storage = plusOne(arr);

		for (int i = 0; i < storage.length; i++)
			System.out.print(storage[i] + " ");

		System.out.println("----");
		plusone();
	}

	// Method 1
	public static void plusone() {
		int arr[] = { 9, 9 }; // 100

		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] == 9)
				arr[i] = 0;
			else {
				arr[i] = arr[i] + 1;
				break;
			}
		}
		arr= new int[arr.length+1];
		arr[0]=1;
		System.out.println(Arrays.toString(arr));
	}

	// Method 2
	public static int[] plusOne(int[] arr) {

		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] < 9) {
				arr[i]++;
				return arr;
			}
			arr[i] = 0;
		}
		// this will be helpful for 99,999,9999
		arr = new int[arr.length + 1];
		arr[0] = 1;
		return arr;
	}
}