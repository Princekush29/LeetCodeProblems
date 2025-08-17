package leetCode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII219 {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 1, 2, 3 };
		int k = 2;
		System.out.println(containsNearbyDuplicate(nums, k));
	}

	// Method1
	/*
	 * public boolean containsNearbyDuplicate(int[] nums, int k) { for (int i = 0; i
	 * < nums.length; i++) { for (int j = i + 1; j < nums.length; j++) { if (nums[i]
	 * == nums[j]) { if (Math.abs(i-j)<=k) return true; } } } return false;
	 */

	// Method2
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {

			if (i > k)
				s.remove(nums[i - k - 1]);
			if (!s.add(nums[i]))
				return true;
		}
		return false;
	}
}