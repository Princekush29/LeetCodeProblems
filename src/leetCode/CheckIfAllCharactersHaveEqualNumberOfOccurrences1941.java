package leetCode;

import java.util.HashMap;
import java.util.Map;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences1941 {

	public static void main(String[] args) {
		String s = "abacbc";
		System.out.println(areOccurrencesEqual(s));
	}

	public static boolean areOccurrencesEqual(String s) {
		Map<Character, Integer> hm = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			if (hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
			} else {
				hm.put(s.charAt(i), 1);
			}
		}
		System.out.println(hm);
		int b = hm.get(s.charAt(0));
		System.out.println("B is " + b);
		for (Map.Entry<Character, Integer> hm1 : hm.entrySet()) {
			if (b != hm1.getValue())
				return false;
		}
		return true;

	}
}
