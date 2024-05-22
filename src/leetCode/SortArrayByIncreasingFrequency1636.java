package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortArrayByIncreasingFrequency1636 {

	public static void main(String[] args) {

		int nums[] = { 1, 1, 2, 2, 2, 3 };
		System.out.println(frequencySort(nums));
	}

	public static int[] frequencySort(int[] nums) {
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (hm.containsKey(nums[i])) {
				hm.put(nums[i], hm.get(nums[i]) + 1);
			} else {
				hm.put(nums[i], 1);
			}
		}
		return Arrays.stream(nums).boxed()
				.sorted((a,b) -> hm.get(a) != hm.get(b) ? hm.get(a) - hm.get(b) : b - a)
				.mapToInt(n -> n)
				.toArray();

	}
}
