package leetCode;

import java.util.Arrays;

public class RotateArray189 {

	public static void main(String[] args) {
		int nums[] = { 1,2 };
		int k = 3;
		// output - [5,6,7,1,2,3,4]
		// output - [4, 5, 1, 2, 3]
		rotate(nums, k);
		// rotate1(nums, k);
	}

	// Method 1 - with more time - two for loop
	/*
	 * public static void rotate1(int[] nums, int k) { int temp; for (int i = 0; i <
	 * k; i++) { for (int j = nums.length - 1; j >= 1; j--) { temp = nums[j];
	 * nums[j] = nums[j - 1]; nums[j - 1] = temp;
	 * 
	 * } } System.out.println(Arrays.toString(nums)); }
	 */

	// Method 2 - with less time
	public static void rotate(int[] nums, int k) {
		// store the last few elements (depending on k) in the new array
		// move the element which are there to the end
		// copy from new array to old array
		if (nums.length<k) {
			k = k % nums.length;
		}
		int x = k;
		int len = nums.length;
		System.out.println("Length is " + nums.length);
		System.out.println(k);
		
		int arr[] = new int[k];
		for (int i = nums.length - 1; k > 0; i--, k--) {
			arr[k - 1] = nums[i];
		}
		System.out.println("New Array is " + Arrays.toString(arr));

		for (int i = len - x - 1; i >= 0; i--, len--) {
			nums[len - 1] = nums[i];
		}
		System.out.println("Modified array is " + Arrays.toString(nums));

		for (int j = 0; j < arr.length; j++) {
			nums[j] = arr[j];
		}
		System.out.println(Arrays.toString(nums));
	}
}
