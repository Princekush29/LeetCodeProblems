package programs;

import java.util.Arrays;

public class TargetSum {

	public static void main(String[] args) {

		int nums[] = { 1, 8, 2, 7, 11, 15 };
		int target = 9;
		System.out.println(twoSum(nums, target));
	}

	public static int[] twoSum(int[] nums, int target) {
		int arr[] = new int[2];

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					arr[0] = i;
					arr[1] = j;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}
}
