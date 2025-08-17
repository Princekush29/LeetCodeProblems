package programs;

import java.util.Arrays;

public class ProductOfNumbers {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4 };
		int arr1[] = new int[arr.length];
		int product = 1;
		// Method 1
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i != count) {

			} else {
				product = product * arr[i];
			}
			arr1[count] = product;
			count++;
			product = 1;
			i = 0;
		}
		System.out.println(Arrays.toString(arr1));
		// Method 2

		/*
		 * for (int i = 0; i < arr.length; i++) { for (int j = 0; j < arr.length; j++) {
		 * if (i != j) { product = product * arr[j]; } } arr1[i] = product; product = 1;
		 * } System.out.println(Arrays.toString(arr1));
		 */
	}
}
