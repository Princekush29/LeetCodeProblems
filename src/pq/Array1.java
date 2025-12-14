package pq;

import java.util.Arrays;

public class Array1 {
	public static void main(String[] args) {
		String[] nums = new String[] { "1", "9", "10","1000" };
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));

		/*
		 * You're sorting a String[] array, which means the elements are sorted
		 * lexicographically (dictionary order), not numerically. So "10" comes before "9" because "1" is
		 * less than "9" in character comparison.
		 */

		int arr[] = { 1, 9, 10 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		/*
		 * - Sorts numerically. - Standard ascending order.
		 */

		String[] os = new String[] { "Mac", "Linux", "Windows" };
		Arrays.sort(os);
		System.out.println(Arrays.toString(os));
		System.out.println(Arrays.binarySearch(os, "Mac"));

	}
}
