package leetCode;

import java.util.Arrays;

public class MissingNumber268 {

	public static void main(String[] args) {
		int nums[] = { 0, 1 };
		System.out.println(missingNumber(nums));
	}

	public static int missingNumber(int[] nums) {
		int number = 0;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++, number++) {
			if (!(nums[i] == number))
				return number;
			if (i == nums.length - 1)
				return nums.length;
		}
		return number;
	}
}