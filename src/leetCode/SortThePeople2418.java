package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortThePeople2418 {

	public static void main(String[] args) {
		String names[] = { "Mary", "John", "Emma" };
		int heights[] = { 180, 165, 170 };
		System.out.println(sortPeople(names, heights));
	}

	public static String[] sortPeople(String[] names, int[] heights) {
		String newNames[] = new String[names.length];
		Map<Integer, String> hm = new HashMap<Integer, String>();
		for (int i = 0; i < names.length; i++) {
			hm.put(heights[i], names[i]);

		}
		Arrays.sort(heights);
		System.out.println(Arrays.toString(heights));
		for (int i = heights.length - 1, j = 0; i >= 0; i--, j++) {
			newNames[j] = hm.get(heights[i]);
		}
		System.out.println(Arrays.toString(newNames));
		return newNames;

	}
}
