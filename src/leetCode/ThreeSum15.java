package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum15 {

	public static void main(String[] args) {
		int nums[] = { -1, 0, 1, 2, -1, -4 };
		System.out.println(threeSum(nums));
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		List<Integer> l = new ArrayList<Integer>();
		List<List<Integer>> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = i + 2; k < nums.length; k++) {
					if (nums[i] + nums[j] + nums[k] == 0 && i != j && i != k && j != k) {
						list.add(Arrays.asList(nums[i], nums[j], nums[k]));
						System.out.println(list);
					}
				}
			}
		}
		return list;
	}
}