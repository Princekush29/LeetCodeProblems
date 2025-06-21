package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindCommonCharacters1002 {

	public static void main(String[] args) {
		String words[] = { "bella", "label", "roller" };
		System.out.println(commonChars(words));
	}

	public static List<String> commonChars(String[] words) {
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		Map<Character, Integer> hm1 = new HashMap<Character, Integer>();
		for (int i = 0; i < words[0].length(); i++) {
			char c = words[0].charAt(i);
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) * 2);
			} else {
				hm.put(c, 2);
			}
		}
		hm1 = hm;
		System.out.println("Hm1 is " + hm1);
		for (int i = 1; i < words.length; i++) {
			for (int j = 0; j < words[i].length(); j++) {
				char d = words[i].charAt(j);
				if (hm.containsKey(d)) {
					hm.put(d, hm.get(d) - 1);
				}
			}
		}
		
		System.out.println("Hm is " + hm);
		List<String> list = new ArrayList<String>();
		return list;

	}
}
