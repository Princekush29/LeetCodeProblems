package leetCode;

import java.util.Arrays;

public class ConcatenationOfArray1929 {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 1 };
		System.out.println(getConcatenation(nums));
	}

	public static int[] getConcatenation(int[] nums) {
		int newArray[] = new int[2 * nums.length];

		for (int i = 0, j = 0; i < newArray.length; i++) {
			newArray[i] = nums[j];
			j++;
			if (j == nums.length)
				j = 0;
		}
		System.out.println(Arrays.toString(newArray));
		return newArray;

	}
}
