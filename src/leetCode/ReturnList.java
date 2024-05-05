package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReturnList {

	public static void main(String[] args) {
		int nums[] = { -1, 0, 1, 2, -1, -4 };
		threeSum(nums);
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		
		List<Integer> l = new ArrayList<Integer>();
		List<List<Integer>> list = new ArrayList<>();
		l.add(1);

		list.add(Arrays.asList(1));
		list.add(Arrays.asList(2));
		System.out.println(list);
		return list;
	}
}