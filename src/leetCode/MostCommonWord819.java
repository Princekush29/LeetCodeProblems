package leetCode;

import java.util.HashMap;
import java.util.Map;

public class MostCommonWord819 {

	public static void main(String[] args) {
		String paragraph = "a, a, a, a, b,b,b,c, c";
		String banned[] = { "a" };
		System.out.println(mostCommonWord(paragraph, banned));
	}

	public static String mostCommonWord(String paragraph, String[] banned) {
		Map<String, Integer> hm = new HashMap<String, Integer>();
		paragraph = paragraph.toLowerCase();
		String newPara = "";
		for (int i = 0; i <= paragraph.length() - 1; i++) {
			if (paragraph.charAt(i) >= 97 && paragraph.charAt(i) <= 122 || paragraph.charAt(i) == ' ')
				newPara = newPara + paragraph.charAt(i);
			else if (paragraph.charAt(i) == ',')
				newPara = newPara + " ";
		}
		String arr[] = newPara.split(" ");
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i].length() > 0) {
				if (hm.containsKey(arr[i])) {
					hm.put(arr[i], hm.get(arr[i]) + 1);
				} else {
					hm.put(arr[i], 1);
				}
			}
		}
		for (int i = 0; i < banned.length; i++) {
			hm.remove(banned[i]);
		}

		String word = "";
		int max = 0;
		for (Map.Entry<String, Integer> hm1 : hm.entrySet()) {

			if (hm1.getValue() > max) {
				max = hm1.getValue();
				word = hm1.getKey();
			}
		}
		return word;
	}
}