package programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class FindIntersectionValues {

	public static void main(String[] args) {

		int[] nums1 = { 4, 3, 2, 3, 1 };
		int[] nums2 = { 2, 2, 5, 2, 3, 6 };
		findIntersectionValues(nums1, nums2);
	}

	public static int[] findIntersectionValues(int[] nums1, int[] nums2) {

		int[] newArray = new int[2];
		int[] a = find(nums2, nums1);
		newArray[0] = a[0];
		int[] a1 = find(nums1, nums2);
		newArray[1] = a1[0];
		System.out.println(Arrays.toString(newArray));
		return newArray;
	}

	public static int[] find(int[] nums1, int[] nums2) {
		Set<Integer> s = new HashSet<Integer>();

		int[] sumArray = new int[1];
		int sum = 0;
		for (int i = 0; i < nums1.length; i++) {
			if (s.add(nums1[i])) {
				int count = 0;
				for (int j = 0; j < nums2.length; j++)
					if (nums1[i] == nums2[j]) {
						count++;
					}
				sum = sum + count;
				sumArray[0] = sum;
			}
		}
		// System.out.println("Sum is " + sum);
		return sumArray;
	}
}