package leetCode;

import java.util.Arrays;

public class TwoSum1 {

	public static void main(String[] args) {
		int nums[] = { 3, 2, 3 };
		int target = 6;
		System.out.println(twoSum(nums, target));
	}

	public static int[] twoSum(int[] nums, int target) {
		int arr[] = new int[2];
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] + nums[i + 1] == target) {
				arr[0] = i;
				arr[1] = i + 1;
			}
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}

}
