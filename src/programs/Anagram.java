package programs;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "lisateanaa";
		String s2 = "sailaentaa";

		// Method1
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(Arrays.equals(c1, c2));
		System.out.println("-------");

		// Method 2
		Map<Character, Integer> hm1 = new HashMap<Character, Integer>();
		for (int i = 0; i < s1.length(); i++) {
			if (hm1.containsKey(s1.charAt(i))) {
				hm1.put(s1.charAt(i), hm1.get(s1.charAt(i)) + 1);
			} else {
				hm1.put(s1.charAt(i), 1);
			}
		}
		System.out.println(hm1);
		Map<Character, Integer> hm2 = new HashMap<Character, Integer>();
		for (int i = 0; i < s2.length(); i++) {
			if (hm2.containsKey(s2.charAt(i))) {
				hm2.put(s2.charAt(i), hm2.get(s2.charAt(i)) + 1);
			} else {
				hm2.put(s2.charAt(i), 1);
			}
		}
		System.out.println(hm2);
		if (hm1.equals(hm2)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram ");
		}
		System.out.println("-------");

		// Method 3
		Map<Character, Integer> hm3 = new HashMap<Character, Integer>();
		for (int i = 0; i < s1.length(); i++) {
			if (hm3.containsKey(s1.charAt(i))) {
				hm3.put(s1.charAt(i), hm3.get(s1.charAt(i)) + 1);
			} else {
				hm3.put(s1.charAt(i), 1);
			}
		}
		for (int i = 0; i < s2.length(); i++) {
			if (hm3.containsKey(s2.charAt(i))) {
				hm3.put(s2.charAt(i), hm3.get(s2.charAt(i)) - 1);
			} else {
				System.out.println("Not Anagram");
			}
		}
		// Extract all keys from Map
		Set<Character> keys = hm3.keySet();
		for (Character key : keys) {
			if (hm3.get(key) != 0)
				System.out.println("Not Anagram");
		}
	}
}