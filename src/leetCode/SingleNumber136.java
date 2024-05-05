package leetCode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber136 {

	public static void main(String[] args) {
		int nums[] = { 4, 1, 2, 1, 2 };
		System.out.println(singleNumber(nums));
	}

	public static int singleNumber(int[] nums) {
		 int result=0;
	        for(int i=0; i<nums.length; i++) {
	            result = result^nums[i];
	        }
	        return result;
		/*
		 * Map<Integer, Integer> hm = new HashMap<Integer, Integer>(); for (int i = 0; i
		 * < nums.length; i++) { if (hm.containsKey(nums[i])) { hm.put(nums[i],
		 * hm.get(nums[i]) + 1); } else { hm.put(nums[i], 1); } }
		 * System.out.println(hm); for (Map.Entry<Integer, Integer> hm1 : hm.entrySet())
		 * { if (hm1.getValue() == 1) return hm1.getKey(); } return 0;
		 */
	}
}
