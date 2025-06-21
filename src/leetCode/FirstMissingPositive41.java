package leetCode;

import java.util.Arrays;

public class FirstMissingPositive41 {

	public static void main(String[] args) {
		int nums[] = { 0, -1, 3, 1 };
		System.out.println("11");
		System.out.println(firstMissingPositive(nums));
		System.out.println("11");
	}

	public static int firstMissingPositive(int[] nums) {

		Arrays.sort(nums);
		// System.out.println(Arrays.toString(nums));
		int token = 1;
		for (int i = 0; i < nums.length;) {
			if (nums[0] <= 0 && nums.length == 1) {
				return 1;
			} else if (nums[i] <= 0) {
				i++;
			}

			if (nums[i] == token) {
				i++;
				token++;
				continue;
			}
			i++;
		}
		return token;

	}
}
