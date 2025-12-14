package leetCode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum1 {

	public static void main(String[] args) {
		int nums[] = { 3, 2, 3 };
		int target = 6;
		System.out.println(twoSum(nums, target));
	}

	public static int[] twoSum(int[] nums, int target) {

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int arr[] = new int[2];
		for (int i = 0; i < nums.length; i++) {
			int complecent = target - nums[i];
			if (hm.containsKey(complecent)) {
				//return new int[] {hm.get(diff), i};
				arr[0] = hm.get(complecent);
				arr[1] = i;
			}
			hm.put(nums[i], i);
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}
}