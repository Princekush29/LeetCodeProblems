package leetCode;

import java.util.HashSet;
import java.util.Set;

public class SetMismatch645 {

	public static void main(String[] args) {

		int nums[] = { 2, 2, 3 };
		System.out.println(findErrorNums(nums));
	}

	public static int[] findErrorNums(int[] nums) {

		int arr[] = new int[2];
		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (s.contains(nums[i])) {
				arr[0] = nums[i];
			}
			s.add(nums[i]);
		}
		for (int i = 1; i <= nums.length; i++) {
			if (!s.contains(i))
				arr[1] = i;
		}
		return arr;
		/*
		 * int arr[] = new int[2]; Arrays.sort(nums);
		 * System.out.println(Arrays.toString(nums)); for (int i = 0; i < nums.length -
		 * 1; i++) { if (nums[i] == nums[i + 1]) arr[0] = nums[i]; // arr[1] = nums[i] +
		 * 1; } int count = 1; Set<Integer> s = new LinkedHashSet<Integer>(); for (int i
		 * = 0; i < nums.length; i++) { s.add(nums[i]); } int number = 1; for (Integer
		 * s1 : s) { if (s1 == number) number++; else { arr[1] = number; break; } } if
		 * (arr[1] == 0) { arr[1] = s.size() + 1; }
		 * System.out.println(Arrays.toString(arr)); return arr;
		 */}
}