package leetCode;

import java.util.Arrays;

public class MergeSortedArray88 {

	/*
	 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3 Output:
	 * [1,2,2,3,5,6] Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
	 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming
	 * from nums1.
	 */

	public static void main(String[] args) {
		int nums1[] = { 1, 2, 3, 0, 0, 0 };
		int nums2[] = { 2, 5, 6 };
		int m = 3, n = 3;
		merge(nums1, m, nums2, n);
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		System.out.println("Hello");
		for (int i = m, j = 0; i < nums1.length; i++, j++) {
			nums1[i] = nums2[j];
		}
		// System.out.println(Arrays.toString(nums1));

		int temp;
		for (int i = 0; i < nums1.length; i++) {
			for (int j = i + 1; j < nums1.length; j++) {
				if (nums1[i] > nums1[j]) {
					temp = nums1[i];
					nums1[i] = nums1[j];
					nums1[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums1));
	}

}