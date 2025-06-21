package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllNumbersDisappearedArray448 {

	public static void main(String[] args) {

		int nums[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
		System.out.println(findDisappearedNumbers(nums));
	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {

		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			s.add(nums[i]);
		}
		System.out.println(Arrays.toString(nums));
		List<Integer> list = new ArrayList<Integer>();

		for (int k = 1; k < nums.length + 1; k++) {
			if (!(s.contains(k)))
				list.add(k);
		}
		return list;
	}
}