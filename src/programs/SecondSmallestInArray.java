package programs;

import java.util.Arrays;

public class SecondSmallestInArray {

	public static void main(String[] args) {

		// Method 1
		int arr[] = { 30, 4, 15 };
		int n1 = arr.length;
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		for (int i = 0; i < n1; i++) {
			if (arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			} else if (arr[i] < secondSmallest) {
				secondSmallest = arr[i];
			}
		}
		System.out.println("Smallest is " + smallest);
		System.out.println("Second Smallest is " + secondSmallest);

		// Method 2 - Sort the array and print second last element
		// No duplicate should be there
		int temp;
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
		System.out.println(arr[arr.length - 2]);
	}
}
