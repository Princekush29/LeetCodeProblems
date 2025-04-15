package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate217 {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4 };
		System.out.println(containsDuplicate(nums));
	}

	public static boolean containsDuplicate(int[] nums) {
		// Method 1 - use two for loop

		// Method 2

		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			
			if (nums[i] == nums[i+1])
				return true;
		}
		return false;

		// Method 3- HashSet

		/*Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (s.contains(nums[i]))
				return true;
			s.add(nums[i]);
		}
		return false;*/

		// Method 4
		/* Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (hm.containsKey(nums[i]))
				return true;
			else
				hm.put(nums[i], 1);
		}
		return false; */
	}
}
