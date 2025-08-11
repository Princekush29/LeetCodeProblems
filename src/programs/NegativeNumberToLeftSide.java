package programs;

import java.util.Arrays;

public class NegativeNumberToLeftSide {

	public static void main(String[] args) {

		int arr[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
		int arr1[] = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0)
				count++;
		}
		System.out.println("Count is " + count);

		for (int i = 0, j = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				arr1[j] = arr[i];
				j++;
			} else {
				arr1[count] = arr[i];
				count++;
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		// Method 2 - this can also we solved like how we swap zero at the end of the
		// array. Only problem with this is it will not be able to maintain the sequence
		int arr2[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
		int temp;
		for (int i = 0, j = arr2.length - 1; i < arr2.length; i++) {
			if (arr2[i] < 0)
				i++;
			if (arr2[j] > 0)
				j--;
			if (i < j && arr2[i] > 0 && arr2[j] < 0) {
				temp = arr2[i];
				arr2[i] = arr2[j];
				arr2[j] = temp;
			}
		}
		System.out.println(Arrays.toString(arr2));
	}
}