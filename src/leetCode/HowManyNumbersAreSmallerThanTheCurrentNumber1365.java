package leetCode;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber1365 {

	public static void main(String[] args) {
		int nums[] = { 8, 1, 2, 2, 3 };
		System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
	}

	public static int[] smallerNumbersThanCurrent(int[] nums) {
		int count = 0;
		int arr[] = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] > nums[j] && i != j)
					count++;
			}
			arr[i] = count;
			count = 0;
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}
}
