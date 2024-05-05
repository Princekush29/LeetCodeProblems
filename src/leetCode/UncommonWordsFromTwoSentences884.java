package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UncommonWordsFromTwoSentences884 {

	public static void main(String[] args) {
		String s1 = "s z z z s", s2 = "s z ejt";
		System.out.println(uncommonFromSentences(s1, s2));
	}

	public static String[] uncommonFromSentences(String s1, String s2) {

		ArrayList<String> al = new ArrayList<String>();
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		s1 = s1 + " " + s2;
		String arr[] = s1.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			} else {
				hm.put(arr[i], 1);
			}
		}
		for (Map.Entry<String, Integer> hm1 : hm.entrySet()) {
			if (hm1.getValue() == 1)
				al.add(hm1.getKey());
		}
		String s[] = new String[al.size()];
		for (int i = 0; i < al.size(); i++) {
			s[i] = al.get(i);
		}
		return s;
	}
}
