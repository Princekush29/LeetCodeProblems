package leetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountCommonWordsWithOneOccurrence2085 {

	public static void main(String[] args) {

		String words1[] = { "a", "ab" }, words2[] = { "a", "a", "a", "ab" };

		System.out.println(countWords(words1, words2));
	}

	public static int countWords(String[] words1, String[] words2) {
		int count = 0;
		HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
		HashMap<String, Integer> hm2 = new HashMap<String, Integer>();
		for (int i = 0; i < words1.length; i++) {
			if (hm1.containsKey(words1[i])) {
				hm1.put(words1[i], hm1.get(words1[i]) + 1);
			} else {
				hm1.put(words1[i], 1);
			}
		}
		for (int i = 0; i < words2.length; i++) {
			if (hm2.containsKey(words2[i])) {
				hm2.put(words2[i], hm2.get(words2[i]) + 1);
			} else {
				hm2.put(words2[i], 1);
			}
		}
		for (String s : hm1.keySet()) {
			if (hm2.containsKey(s) && hm2.get(s) == 1 && hm1.get(s) == 1) {
				count++;
			}
		}
		return count;

	}
}
