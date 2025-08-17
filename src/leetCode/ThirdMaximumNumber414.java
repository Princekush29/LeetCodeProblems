package leetCode;

import java.util.Arrays;
import java.util.HashSet;

public class ThirdMaximumNumber414 {

	public static void main(String[] args) {

		int nums[] = { 2, 2, 3, 1 };
		System.out.println(thirdMax(nums));
	}

	public static int thirdMax(int[] nums) {
		Arrays.sort(nums);
		System.out.println("Output is " + Arrays.toString(nums));
		HashSet<Integer> s = new HashSet<Integer>();
		int k = 0;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (s.add(nums[i])) {
				k++;
			}
			if (k == 3) {
				return nums[i];
			}
		}

		return nums[nums.length - 1];
	}
}