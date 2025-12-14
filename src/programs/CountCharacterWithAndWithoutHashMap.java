package programs;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterWithAndWithoutHashMap {

	public static void main(String[] args) {
		String s = "AAAaaa";
		// Method1
		int count[] = new int[256];

		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i)]++;
		}

		for (int i = 0; i < count.length; i++) {
			if (count[i] > 0) {
				char c = (char) i;
				System.out.println(c + " " + count[i]);
			}
		}
		// Method2

		Map<Character, Integer> hm = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			if (hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
			} else {
				hm.put(s.charAt(i), 1);
			}
		}
		System.out.println("---");
		System.out.println(hm);
		System.out.println("------");
		for (Map.Entry<Character, Integer> hm1 : hm.entrySet()) {
			System.out.println(hm1.getKey() + " " + hm1.getValue());
		}
	}
}











