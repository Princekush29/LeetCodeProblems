package leetCode;

import java.util.Arrays;

public class MoveZeroes283 {

	public static void main(String[] args) {

		int nums[] = { 0, 1 };
		moveZeroes(nums);
	}

	public static void moveZeroes(int[] nums) {
		int count = 0;
		int len =nums.length;
		System.out.println("len is "+len);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0)
				count++;
		}
;		int j=0;
		for (int i = 0; i < nums.length;) {
			if (nums[i] != 0) {
				nums[j] = nums[i];
				j++;

			}
			i++;
		}
		for (int i = j ; i < nums.length; i++) {
			nums[i] = 0;
		}
		System.out.println(Arrays.toString(nums));
	}
}
