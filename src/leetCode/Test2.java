package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test2 {

	public static void main(String[] args) {
		String s1 = "s z z z s", s2 = "s z ejt";
		System.out.println(uncommonFromSentences(s1, s2));
	}

	public static String[] uncommonFromSentences(String s1, String s2) {

		s1 = s1 + " " + s2;
		String arr[] = s1.split(" ");
		HashMap<String, Integer> hs = new HashMap<String, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (hs.containsKey(arr[i])) {
				hs.put(arr[i], hs.get(arr[i]) + 1);
			} else {
				hs.put(arr[i], 1);
			}
		}
		ArrayList<String> al = new ArrayList<String>();
		for (Map.Entry<String, Integer> hs1 : hs.entrySet()) {
			if (hs1.getValue() == 1)
				al.add(hs1.getKey());

		}
		System.out.println(hs);
		System.out.println(al);
		String[] str = new String[al.size()];
		for (int i = 0; i < al.size(); i++) {
			str[i] = al.get(i);
		}
		return str;
	}
}
