package leetCode;

import java.util.Arrays;

public class SortArrayByParity905 {

	public static void main(String[] args) {
		int nums[] = { 0, 1, 2 };
		System.out.println(sortArrayByParity(nums));
	}

	public static int[] sortArrayByParity(int[] nums) {

		for (int i = 0, j = nums.length - 1; i <= j;) {
			if (nums[i] % 2 == 0)
				i++;
			else if (nums[j] % 2 != 0)
				j--;
			else if (nums[i] % 2 != 0 && nums[j] % 2 == 0) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				i++;
				j--;
			}
		}
		System.out.println(Arrays.toString(nums));

		return nums;
	}
}