package leetCode;

import java.util.HashMap;
import java.util.Map;

public class CountElementsWithMaximumFrequency3005 {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 2, 3, 4, 4 };
		System.out.println(maxFrequencyElements(nums));
	}

	public static int maxFrequencyElements(int[] nums) {
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (hm.containsKey(nums[i])) {
				hm.put(nums[i], hm.get(nums[i]) + 1);
			} else {
				hm.put(nums[i], 1);
			}
		}
		System.out.println("Hashmap is " + hm);
		int count = 0, newCount = 0, newCount1 = 0, sum = 0;
		for (Map.Entry<Integer, Integer> hm1 : hm.entrySet()) {
			count = hm1.getValue();
			if (newCount <= count) {
				newCount = count;
				sum = sum + newCount;
			}
			if (newCount1 != newCount) {
				sum = 0;
				newCount1 = newCount;
				sum = sum + newCount1;
			}
		}
		return sum;
	}
}