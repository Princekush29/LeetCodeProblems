package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicatesfromSortedArrayII {

	public static void main(String[] args) {
		int nums[] = { -3, -1, 0, 0, 0, 3, 3 };
		System.out.println(removeDuplicates(nums));
	}

	public static int removeDuplicates(int[] nums) {
		Map<Integer, Integer> hm = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (hm.containsKey(nums[i])) {
				hm.put(nums[i], hm.get(nums[i]) + 1);
			} else {
				hm.put(nums[i], 1);
			}
		}
		System.out.println(hm);
		int i = 0;
		for (Map.Entry<Integer, Integer> hm1 : hm.entrySet()) {
			if (hm1.getValue() == 1) {
				nums[i] = hm1.getKey();
				i++;
			} else if (hm1.getValue() > 1) {
				nums[i] = hm1.getKey();
				i++;
				nums[i] = hm1.getKey();
				i++;
			}
		}
		System.out.println(Arrays.toString(nums));
		System.out.println("++");
		

		return i;
	}
}