package leetCode;

import java.util.Arrays;

public class MaximumProductThreeNumbers628 {

	public static void main(String[] args) {
		int nums[] = { -100, -98, -1, 2, 3, 4 };
		System.out.println(maximumProduct(nums));
	}

	public static int maximumProduct(int[] nums) {

		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		int m1 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
		int m2 = nums[0] * nums[1] * nums[nums.length - 1];
		if (m1 > m2)
			return m1;
		else
			return m2;

	}

}
