package leetCode;

import java.util.Arrays;

public class MedianOfTwoSortedArrays4 {

	public static void main(String[] args) {
		int nums1[] = { 1, 2 };
		int nums2[] = { 3, 4 };
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int nums3[] = new int[nums1.length + nums2.length];

		for (int i = 0; i < nums1.length; i++) {
			nums3[i] = nums1[i];
		}
		int j = nums1.length;
		for (int i = 0; i < nums2.length; i++) {
			nums3[j] = nums2[i];
			j++;
		}
		Arrays.sort(nums3);
		System.out.println(Arrays.toString(nums3));
		int len = nums3.length;
		int len1 = nums3.length / 2;
		int len2 = nums3.length / 2 - 1;
		if (nums3.length % 2 == 0) {
			float f = (float)(nums3[len1] + nums3[len2]) / 2;
			return f;
		}
		int f1 = nums3[nums3.length / 2];
		return f1;

	}
}