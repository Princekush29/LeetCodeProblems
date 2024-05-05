package programs;

public class MaxMinInArray {

	public static void main(String[] args) {
		// Method 1
		int arr[] = { 90, 8, 7, 6, 10, 1, 4, 5, 6, 3, 2 };
		/*
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				i = -1;
			}
		}*/
		System.out.println("Maximum number is " + arr[arr.length - 1]);
		System.out.println("Minimum number is " + arr[0]);
		System.out.println("---");
		// Method 2
		int max = arr[0], min = arr[0];
		for (int num : arr) {
			if (max < num) {
				max = num;
			} else if (min > num) {
				min = num;
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
