package programs.Array;

import java.util.Arrays;

public class ProductOfNumbers {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4 };
		int arr1[] = new int[arr.length];
		int product = 1;
		// Method 1
		int count = 0;
		for (int i = 0, j = 0; i < arr.length; j++) {
			if (i != j) {
				product = product * arr[j];
			}
			if (j == arr.length - 1) {
				arr1[count] = product;
				count++;
				product = 1;
				j = -1;
				i++;
			}
		}
		System.out.println(Arrays.toString(arr1));
	}
}
