package leetCode;

import java.util.Arrays;

public class DivideAnArrayIntoSubarraysWithMinimumCostI3010 {

	public static void main(String[] args) {

		int nums[] = { 1, 2, 1 };
		System.out.println(minimumCost(nums));
	}

	public static int minimumCost(int[] nums) {
		int nums1[] = nums.clone();
		Arrays.sort(nums);
		int sum = 0;
		int len = nums.length;
		if (len == 3)
			return nums[0] + nums[1] + nums[2];
		if (nums[0] == nums1[0] && nums[1] == nums1[1] && nums[2] == nums1[2])
			return nums[0] + nums[1] + nums[2];
		else
			return nums[0] + nums[1] + nums[nums.length-1];
	}
}