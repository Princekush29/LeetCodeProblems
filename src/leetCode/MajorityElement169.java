package leetCode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {

	public static void main(String[] args) {

		int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(majorityElement(nums));
	}

	public static int majorityElement(int[] nums) {
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (hm.containsKey(nums[i])) {
				hm.put(nums[i], hm.get(nums[i]) + 1);
			} else {
				hm.put(nums[i], 1);
			}
		}
		System.out.println(hm);
		int element = 0, majority = 0, majority1 = 0;
		for (Map.Entry<Integer, Integer> hm1 : hm.entrySet()) {
			element = hm1.getValue();

			if (element > majority) {
				majority = element;
			}
			if (hm1.getValue().equals(majority)) {
				majority1 = hm1.getKey();
			}
		}
		return majority1;
	}
}