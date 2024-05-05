package leetCode;

import java.util.Arrays;

public class RotateArray189_1 {

	public static void main(String[] args) {
		int nums[] = { 1,2 };
		int k = 3;
		// output - [5,6,7,1,2,3,4]
		// output - [4, 5, 1, 2, 3]
		rotate(nums, k);
		// rotate1(nums, k);
	}

	public static void rotate(int[] nums, int k) {
		// It is not needed to rotate if you end up at same place.
		// Hence eliminating 360 degree rotating with remainder
		if (nums.length < k) {
			k = k % nums.length;
		}
		System.out.println("K is "+k);

		// Find the ending suffix part
		// This needs to be copied and pasted into the beginning later
		int[] suffix = new int[k];
		for (int m = 0; m < k; m++) {
			suffix[k - m - 1] = nums[nums.length - m - 1];
		}

		// Shift the beginning to the end in reverse fashion
		for (int i = nums.length - 1; i >= k; i--) {
			nums[i] = nums[i - k];
		}

		// Paste the copied ending part to the beginning.
		for (int m = 0; m < k; m++) {
			nums[m] = suffix[m];
		}
		System.out.println(Arrays.toString(nums));
	}

}
