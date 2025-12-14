package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupStringByTheirLength {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("test", "automation", "QA", "Java", "code", "Selenium", "API");

		Map<Integer, List<String>> hm = new HashMap<Integer, List<String>>();

		for (String word : words) {
			int len = word.length();
			if (!hm.containsKey(len)) {
				hm.put(len, new ArrayList<>());
			}
			hm.get(len).add(word);
		}
		System.out.println(hm);
	}
}














