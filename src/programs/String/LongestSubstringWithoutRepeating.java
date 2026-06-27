package programs.String;

import java.util.LinkedHashSet;
import java.util.Set;

class LongestSubstringWithoutRepeating {

	public static void main(String[] args) {
		String s = "pwwakewabbc";
		System.out.println(lengthOfLongestSubstring(s));
	}

	public static int lengthOfLongestSubstring(String s) {

		int length = s.length();
		int maxlength = 0;

		Set<Character> charSet = new LinkedHashSet<Character>();

		int left = 0;
		String s1 = "";
		for (int right = 0; right < length; right++) {
			if (!charSet.contains(s.charAt(right))) {
				charSet.add(s.charAt(right));
				if (maxlength < (right - left + 1)) {
					maxlength = Math.max(maxlength, right - left + 1);
					s1 = charSet.toString();
				}
			} else {
				while (charSet.contains(s.charAt(right))) {
					charSet.remove(s.charAt(left));
					left++;
				}
				charSet.add(s.charAt(right));
			}
		}
		System.out.println(s1);
		return maxlength;

	}
}