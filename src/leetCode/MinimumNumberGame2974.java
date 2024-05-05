package leetCode;

import java.util.Arrays;

public class MinimumNumberGame2974 {

	public static void main(String[] args) {
		int nums[] = { 5, 4, 2, 3 };
		System.out.println(numberGame(nums));
	}

	public static int[] numberGame(int[] nums) {

		int arr[] = new int[nums.length];
		Arrays.sort(nums);
		for (int i = 0, j = 1; i <= nums.length - 2;) {
			arr[i] = nums[j];
			j--;
			i++;
			arr[i] = nums[j];
			j = j + 3;
			i++;
		}
		System.out.println("Arr" + Arrays.toString(arr));
		return arr;
	}
}