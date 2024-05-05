package leetCode;

import java.util.Arrays;

public class LongestCommonPrefix14 {

	public static void main(String[] args) {
		String strs[] = { "flower", "flow", "flight" };
		// String strs[] = { "dog", "racecar", "car" };
		longestCommonPrefix(strs);
	}

	public static String longestCommonPrefix(String[] strs) {

		Arrays.sort(strs);
		int length = Math.min(strs[0].length(), strs[strs.length - 1].length());
		int i = 0;
		while (i < length && strs[0].charAt(i) == strs[strs.length - 1].charAt(i))
			i++;

		String commonPrefix = strs[0].substring(0, i);
		System.out.println(commonPrefix);
		return commonPrefix;

	}
}
