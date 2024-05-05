package leetCode;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram242 {

	public static void main(String[] args) {
		String s = "anacram", t = "nagaram";
		System.out.println(isAnagram(s, t));
	}

	public static boolean isAnagram(String s, String t) {

		Map<Character, Integer> hm1 = new HashMap<Character, Integer>();
		Map<Character, Integer> hm2 = new HashMap<Character, Integer>();

		hm1 = hash(s, hm1);
		hm2 = hash(t, hm2);
		if (hm1.equals(hm2))
			return true;
		else
			return false;
	}

	public static Map<Character, Integer> hash(String s, Map<Character, Integer> hm1) {
		for (int i = 0; i < s.length(); i++) {
			if (hm1.containsKey(s.charAt(i))) {
				hm1.put(s.charAt(i), hm1.get(s.charAt(i)) + 1);
			} else {
				hm1.put(s.charAt(i), 1);
			}
		}
		return hm1;
	}

}
