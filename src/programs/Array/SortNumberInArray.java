package programs.Array;

import java.util.Arrays;

public class SortNumberInArray {

	public static void main(String[] args) {
		int temp = 0;
		int arr[] = { 1, 2, 3, 4, 5, 1, 3, 4 };
		int arr1[] = { 1, 2, 3, 4, 5, 1, 3, 4 };
		int arr2[] = { 1, 2, 7, 5, 4, 3, 2 };
		int arr3[] = { 10, 20, 70, 50, 40, 30, 20 };

		// Method1
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// Method2
		System.out.println("---");

		for (int i = 0; i < arr1.length - 1; i++) {
			if (arr1[i] > arr1[i + 1]) {
				temp = arr1[i];
				arr1[i] = arr1[i + 1];
				arr1[i + 1] = temp;
				i = -1;
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		// Method3
		Arrays.sort(arr2);
		System.out.println("Array 2 is " + Arrays.toString(arr2));

	}
}
