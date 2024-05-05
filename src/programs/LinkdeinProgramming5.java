/*Code-69 | Java

Problem : You are given two 0-indexed integer arrays nums1 and nums2 of sizes n and m, respectively.
Consider calculating the following values:
The number of indices i such that 0 <= i < n and nums1[i] occurs at least once in nums2.
The number of indices i such that 0 <= i < m and nums2[i] occurs at least once in nums1.
Return an integer array answer of size 2 containing the two values in the above order.
*/
// o/p should be how many numbers from array1 is present in array2 and vice
// versa
package programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LinkdeinProgramming5 {

	public static void main(String[] args) {

		int[] nums1 = { 4, 3, 2, 3, 1 };
		int[] nums2 = { 2, 2, 5, 2, 3, 6 };
		int[] newArray = new int[2];
		int[] a = findIntersectionValues(nums2, nums1);
		newArray[0] = a[0];
		int[] a1 = findIntersectionValues(nums1, nums2);
		newArray[1] = a1[0];

		System.out.println(Arrays.toString(newArray));
	}

	public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
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
		return sumArray;
	}
}