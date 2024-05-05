package leetCode;

import java.util.Arrays;

public class BuildArrayFromPermutation1920 {

	public static void main(String[] args) {
		int nums[] = { 0, 2, 1, 5, 3, 4 };
		System.out.println(buildArray(nums));
	}

	public static int[] buildArray(int[] nums) {
		int newArray[] = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			newArray[i] = nums[nums[i]];
		}
		System.out.println(Arrays.toString(newArray));
		return newArray;
	}
}
