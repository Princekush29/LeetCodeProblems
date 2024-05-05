package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class LargestPositiveIntegerThatExistsWithItsNegative2441 {

	public static void main(String[] args) {
		int nums[] = { -1, 2, -3, 3 };
		System.out.println(findMaxK(nums));
	}

	public static int findMaxK(int[] nums) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 0) {
				al.add(Math.abs(nums[i]));
			}
		}

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			int a = (int) itr.next();
			for (int i = 0; i < nums.length; i++) {
				if (a == nums[i])
					return a;
			}
		}
		return -1;
	}
}
