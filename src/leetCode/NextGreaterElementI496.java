package leetCode;

import java.util.Arrays;

public class NextGreaterElementI496 {

	public static void main(String[] args) {
		int nums1[] = { 1, 3, 5, 2, 4 }, nums2[] = { 6, 5, 4, 3, 2, 1, 7 };
		System.out.println(nextGreaterElement(nums1, nums2));
	}

	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int arr[] = new int[nums1.length];

		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length - 1; j++) {
				if (nums1[i] == nums2[j]) {
					for (int k = j+1; k < nums2.length; k++) {
						if (nums2[k] > nums1[i]) {
							arr[i] = nums2[k];
							break;
						}
					}
				}
			}
			if (arr[i] == 0)
				arr[i] = -1;
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}
}
