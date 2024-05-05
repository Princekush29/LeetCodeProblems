package leetCode;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements1748 {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 2 };
		System.out.println(sumOfUnique(nums));
	}

	public static int sumOfUnique(int[] nums) {

		int sum = 0;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (hm.containsKey(nums[i])) {
				hm.put(nums[i], hm.get(nums[i]) + 1);
			} else {
				hm.put(nums[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> hm1 : hm.entrySet()) {
			if (hm1.getValue() == 1)
				sum = sum + hm1.getKey();
		}
		return sum;
	}
}
