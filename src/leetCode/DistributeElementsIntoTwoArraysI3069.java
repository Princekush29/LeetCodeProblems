package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class DistributeElementsIntoTwoArraysI3069 {

	public static void main(String[] args) {
		int nums[] = { 5, 4, 3, 8 };
		System.out.println(resultArray(nums));
	}

	public static int[] resultArray(int[] nums) {
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al1.add(nums[0]);
		al2.add(nums[1]);

		for (int i = 2; i < nums.length; i++) {
			if (al1.get(al1.size() - 1) > al2.get(al2.size() - 1))
				al1.add(nums[i]);
			else
				al2.add(nums[i]);
		}
		Iterator<Integer> itr1 = al1.iterator();
		Iterator<Integer> itr2 = al2.iterator();
		int i = 0;
		while (itr1.hasNext()) {
			nums[i] = (int) itr1.next();
			i++;
		}
		while (itr2.hasNext()) {
			nums[i] = (int) itr2.next();
			i++;
		}
		System.out.println(Arrays.toString(nums));
		return nums;

	}
}
