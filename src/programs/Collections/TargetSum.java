package programs.Collections;

import java.util.HashMap;

public class TargetSum {

	public static void main(String[] args) {

		int nums[] = { 1, 4, 3, 4, 8, 2, 7, 11, 15 };
		int target = 9;
		System.out.println(twoSum(nums, target));
		int[] a = twoSum(nums, target);
		System.out.println(a[0]);
		System.out.println(a[1]);
	}

	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int diff = target - nums[i];
			if (hm.containsKey(diff)) {
				return new int[] { hm.get(diff), i };
			}
			hm.put(nums[i], i);
		}
		return new int[2];
	}
}
