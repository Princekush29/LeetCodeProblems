package leetCode;

import java.util.Arrays;

public class RemoveElement27 {

	/*
	 * Input: nums = [0,1,2,2,3,0,4,2], val = 2 Output: 5, nums = [0,1,4,0,3,_,_,_]
	 * Explanation: Your function should return k = 5, with the first five elements
	 * of nums containing 0, 0, 1, 3, and 4. Note that the five elements can be
	 * returned in any order. It does not matter what you leave beyond the returned
	 * k (hence they are underscores).
	 */
	public static void main(String[] args) {
//		int nums[] = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int nums[] = { 0, 0, 1, 2, 4, 1, 0, 4, 4, 0, 1, 3 };
		int val = 1;
		removeElement(nums, val);
	}

	public static int removeElement(int[] nums, int val) {
		int k = 0;
		Arrays.sort(nums);
		int temp;
		for (int i = 0, j = nums.length - 1; i < nums.length - 1; i++) {
			if (nums[i] == val && nums[j] != val && j > i) {
				temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				j--;
			}
			System.out.println("arr" + Arrays.toString(nums));
		}
		System.out.println("arr" + Arrays.toString(nums));
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val)
				k++;
		}
		System.out.println("K is " + k);
		int arr[] = new int[nums.length - k];

		for (int i = 0; i < arr.length; i++) {
			if (nums[i] != val) {
				arr[i] = nums[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		return arr.length;

	}
}
