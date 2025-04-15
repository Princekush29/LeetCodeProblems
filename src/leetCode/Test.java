package leetCode;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {

		String s = "aaabaaaa";
		System.out.println(makeFancyString(s));
	}

	public static String makeFancyString(String s) {

		// Method 1
		/*
		 * int count = 0; String newStr = ""; for (int i = 0; i < s.length() - 1; i++) {
		 * if (s.charAt(i) == s.charAt(i + 1)) { count++; if (count <= 1) { newStr =
		 * newStr + s.charAt(i); } } else { newStr = newStr + s.charAt(i); count = 0; }
		 * 
		 * } return newStr + s.charAt(s.length() - 1);
		 */
		String newStr = "";
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length() - 1; i++) {
			if (hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
			} else {
				hm.put(s.charAt(i), 1);
			}
		}
		System.out.println(hm);
		return newStr;
	}
}