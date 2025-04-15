package leetCode;

import java.util.Arrays;

public class DivideAnArrayIntoSubarraysWithMinimumCostI3010 {

	public static void main(String[] args) {

		int nums[] = { 1, 2, 1 };
		System.out.println(minimumCost(nums));
	}

	public static int minimumCost(int[] nums) {
		int n = nums.length;
		int s = nums[0];
		Arrays.sort(nums, 1, n);
		return s + nums[1] + nums[2];
	}
}