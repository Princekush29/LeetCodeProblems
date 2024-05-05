package leetCode;

import java.util.Arrays;

public class MaximumProductDifferenceBetweenTwoPairs1913 {

	public static void main(String[] args) {
		int nums[] = { 5, 6, 2, 7, 4 };
		System.out.println(maxProductDifference(nums));
	}

	public static int maxProductDifference(int[] nums) {
		Arrays.sort(nums);

		return nums[nums.length - 1] * nums[nums.length - 2] - nums[0] * nums[1];
	}
}
