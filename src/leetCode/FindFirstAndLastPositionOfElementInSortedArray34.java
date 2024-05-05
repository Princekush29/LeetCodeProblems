package leetCode;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray34 {

	public static void main(String[] args) {
		int nums[] = { 1 };
		int target = 1;
		System.out.println("Length is " + nums.length);
		System.out.println("Nums 0 is " + nums[0]);
		searchRange(nums, target);
	}

	public static int[] searchRange(int[] nums, int target) {
		int arr[] = new int[2];
		System.out.println("hello" + Arrays.toString(arr));
		arr[0] = -1;
		arr[1] = -1;
		int token = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target && token == 0) {
				arr[0] = i;
				token = 1;
			}
			if (nums[i] == target && token == 1) {
				arr[1] = i;
			}
		}

		System.out.println(Arrays.toString(arr));
		return arr;
	}
}
