package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams49 {

	public static void main(String[] args) {
		String strs[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(groupAnagrams(strs));
	}

	public static List<List<String>> groupAnagrams(String[] strs) {

		if (strs.length == 0 || strs == null)
			return new ArrayList<>();

		Map<String, List<String>> memo = new HashMap<>();
		for (String s : strs) {
			char[] ch = s.toCharArray();
			Arrays.sort(ch);
			String keyStr = String.valueOf(ch);
			if (!memo.containsKey(keyStr))
				memo.put(keyStr, new ArrayList<>());
			memo.get(keyStr).add(s);

		}
		return new ArrayList<>(memo.values());
	}
}
