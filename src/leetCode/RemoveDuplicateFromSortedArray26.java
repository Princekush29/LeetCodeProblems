package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromSortedArray26 {

	public static void main(String[] args) {
		int nums[] = { 1, 1, 2 };
		System.out.println(removeDuplicates(nums));
	}

	public static int removeDuplicates(int[] nums) {

		Set<Integer> s = new HashSet<Integer>();
		List<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (s.add(nums[i])) {
				l.add(nums[i]);
			}
		}
		System.out.println("s" + l);
		int i = 0;

		/*
		 * nums = new int[nums.length]; System.out.println("+++");
		 * System.out.println(Arrays.toString(nums));
		 */
		Iterator<Integer> itr = l.iterator();
		while (itr.hasNext()) {

			nums[i] = itr.next();
			i++;
		}

		System.out.println(Arrays.toString(nums));
		return s.size();
	}
}
