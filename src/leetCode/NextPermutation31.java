package leetCode;

import java.util.Arrays;

public class NextPermutation31 {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3 };
		nextPermutation(nums);
	}

	public static void nextPermutation(int[] nums) {
		int temp = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[0] < nums[1]) {
				temp = nums[nums.length - 2];
				nums[nums.length - 2] = nums[nums.length - 1];
				nums[nums.length - 1] = temp;
				break;
			}
			if (nums[0] <= nums[1] && nums[1] <= nums[2]) {
				temp = nums[nums.length - 2];
				nums[nums.length - 2] = nums[nums.length - 1];
				nums[nums.length - 1] = temp;
				break;
			} else {
			}
			Arrays.sort(nums);
			break;
		}

		System.out.println(Arrays.toString(nums));
	}
}