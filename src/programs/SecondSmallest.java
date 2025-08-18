package programs;

import java.util.Arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		int arr[] = { -11, -12, -3, -7, -6, -4 };
		firstTwoMin(arr);
		secondSmall(arr);
	}

	public static void firstTwoMin(int arr[]) {
		int firstMin = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < firstMin) {
				secondMin = firstMin;
				firstMin = arr[i];
			}

			else if (arr[i] < secondMin && arr[i] > firstMin) {
				secondMin = arr[i];
			}
		}
		System.out.println(firstMin);
		System.out.println(secondMin);
	}

	public static void secondSmall(int arr[]) {
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