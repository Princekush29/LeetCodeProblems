package programs;

import java.util.Arrays;

public class SortZeroAndOnes {

	static int temp;

	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1 };
		int arr3[] = { 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1 };
		method1(arr);
		method2(arr);
		method2(arr3);
	}

	// Method 1 - using for and if loop
	public static void method1(int[] arr) {
		for (int i = 0, j = arr.length - 1; i < j;) {
			if (arr[i] != 0)
				i++;
			if (arr[j] == 0)
				j--;
			if (arr[i] == 0 && arr[j] != 0 && i < j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	// Method 2 - sort the array
	public static void method2(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("++++");
	}

	// Method 3
	public static void method3(int arr3[]) {

		for (int i = 0; i < arr3.length; i++) {
			if (arr3[i] == 1) {
				for (int j = i + 1; j < arr3.length; j++) {
					if (arr3[j] == 0) {
						temp = arr3[i];
						arr3[i] = arr3[j];
						arr3[j] = temp;
						break;
					}
				}
			}
		}
		System.out.println(Arrays.toString(arr3));
	}
}
