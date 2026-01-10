package programs.Array;

import java.util.Arrays;

public class MaxMinInArray {

	public static void main(String[] args) {

		int arr1[] = { 90, 8, 7, 6, 10, 1, 4, 5, 6, 3, 2 };
		int arr[] = { 90, 8, 7, 6, 10, 1, 4, 5, 6, 3, 2 };
		int arr2[] = { 90, 8, 7, 6, 10, 1, 4, 5, 6, 3, 2 };
		int arr3[] = { 90, 8, 7, 6, 10, 1, 4, 5, 6, 3, 2 };

		// Method 1
		System.out.println(System.currentTimeMillis());
		int max = arr1[0], min = arr1[0];
		for (int num : arr1) {
			if (max < num) {
				max = num;
			} else if (min > num) {
				min = num;
			}
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(System.currentTimeMillis());

		// Method 2 - Sort the array and print first and last element
		System.out.println(System.currentTimeMillis());
		int temp2;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = i + 1; j < arr2.length; j++) {
				if (arr2[i] > arr2[j]) {
					temp2 = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp2;
				}
			}
		}
		System.out.println("Maximum Num is " + arr2[arr2.length - 1]);
		System.out.println("Minimum Num is " + arr2[0]);
		System.out.println(System.currentTimeMillis());

		// Method 3 - Sorting using one for loop
		System.out.println(System.currentTimeMillis());
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				i = -1;
			}
		}
		System.out.println("Maximum number is " + arr[arr.length - 1]);
		System.out.println("Minimum number is " + arr[0]);
		System.out.println(System.currentTimeMillis());

		// Method 4
		Arrays.sort(arr3);
		System.out.println("Maximum is " + arr[arr.length - 1]);
		System.out.println("Minimum is " + arr[0]);
	}
}