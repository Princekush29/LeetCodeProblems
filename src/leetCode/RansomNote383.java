package leetCode;

import java.util.HashMap;

public class RansomNote383 {

	public static void main(String[] args) {
		String ransomNote = "aa", magazine = "ab";
		System.out.println(canConstruct(ransomNote, magazine));
	}

	public static boolean canConstruct(String ransomNote, String magazine) {

		HashMap<Character, Integer> dic = new HashMap<Character, Integer>();
		for (int i = 0; i < magazine.length(); i++) {
			if (dic.containsKey(magazine.charAt(i))) {
				dic.put(magazine.charAt(i), dic.get(magazine.charAt(i)) + 1);
			} else {
				dic.put(magazine.charAt(i), 1);
			}
		}
		System.out.println(dic);
		for (int i = 0; i < ransomNote.length(); i++) {
			char c = ransomNote.charAt(i);
			if (dic.containsKey(c)) {
				dic.replace(c, dic.get(c), dic.get(c) - 1);
				if (dic.get(c) == -1) {
					return false;
				}
			} else {
				return false;
			}
		}
		return true;

		/*
		 * int i = 0, j = 0; while ( i < ransomNote.length() && j < magazine.length()) {
		 * if (ransomNote.charAt(i) == magazine.charAt(j)) { i++; j++; } else { j++; } }
		 * if (i == ransomNote.length()) return true; return false;
		 */

	}
}
