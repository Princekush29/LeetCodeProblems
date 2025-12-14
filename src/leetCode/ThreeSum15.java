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
		int target = 0;
		Arrays.sort(nums);
		List<List<Integer>> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if(i>0 && nums[i]==nums[i-1])
			{
				continue;
			}
			int j = i + 1;
			int k = nums.length - 1;

			while (j < k) {
				target = nums[i] + nums[j] + nums[k];
				if (target > 0) {
					k--;
				}
				else if (target < 0) {
					j++;
				}
				else {
					list.add(Arrays.asList(nums[i], nums[j], nums[k]));
					j++;
					while(nums[j]==nums[j-1] &&j<k)
						j++;
				}
			}
		}
		return list;
	}
}