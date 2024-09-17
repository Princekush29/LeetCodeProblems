package programs;

public class Testingo9 {

	public static void main(String[] args) {

		/*
		 * Given two strings s and t, return true if s is a subsequence of t, or false
		 * otherwise.
		 * 
		 * A subsequence of a string is a new string that is formed from the original
		 * string by deleting some (can be none) of the characters without disturbing
		 * the relative positions of the remaining characters. (i.e., "ace" is a
		 * subsequence of "abcde" while "aec" is not).
		 */

		/*
		 * Input: s = "abc", t = "ahbgdc" Output: true Input: s = "axc", t = "ahbgdc"
		 * Output: false axc --> hbxafdc
		 */

		String s = "axc";
		String t = "ahbgdc";
		int i, j;
		for (i = 0, j = 0; i < s.length() && j < t.length();) {
			if (s.charAt(i) == t.charAt(j)) {
				i++;
				j++;
			} else {
				j++;
			}
		}

		if (i == s.length()) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}